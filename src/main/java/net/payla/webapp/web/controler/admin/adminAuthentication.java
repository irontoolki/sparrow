package net.payla.webapp.web.controler.admin;


import net.payla.webapp.dao.PaylaRepo;
import net.payla.webapp.dao.UserInfo;
import net.payla.webapp.security.iam.ActiveUserStore;
import net.payla.webapp.api.security.AuthService;
import net.payla.webapp.system.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
public class adminAuthentication {
    ActiveUserStore activeUserStore = ActiveUserStore.getInstance();

    @Autowired
    PaylaRepo paylaRepo;

    @GetMapping("/v1/list")
    public String listAllUser(Model model) throws NoSuchAlgorithmException {
        List<UserInfo> userlist = paylaRepo.findAll();
        model.addAttribute("userlist", userlist);
        return "list";
    }

    @GetMapping("/v1/reg")
    public String registerNewUser(@RequestParam(required = true) Long id,
                                  @RequestParam(required = true) String password,
                                  @RequestParam(required = true) String email) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        paylaRepo.save(userInfo);
        return "reg";
    }

    @GetMapping("/v1/profile")
    public String userProfile() {

        return "account/profile";
    }


    @GetMapping("/v1/auth")
    public String authentication(Model model,
                                 HttpServletResponse response,
                                 HttpServletRequest request,
                                 @RequestParam(required = true) String id,
                                 @RequestParam(required = true) String password) throws NoSuchAlgorithmException {

        //todo if user credentials matched in database then do below statement
        AuthService authService = new AuthService();

        if (authService.login(id).equals("TOKEN-123456-0000")) {
            activeUserStore.registerUserByID(id);
            Cookie cookie = new Cookie("payla_auth", Utilities.calcCookieHash("12345678"));
            cookie.setMaxAge(7 * 24 * 60 * 60);
            response.addCookie(cookie);
            model.addAttribute("msg", "SUCCESSED by API");
            return "dashboard";

        } else {
            return "login";
        }

    }


    @GetMapping("/login")

    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletResponse response,
                         HttpServletRequest request,
                         @RequestParam(required = true) String id,
                         @RequestParam(required = true) String password) throws NoSuchAlgorithmException {

        //todo if user credentials matched in database then do below statement
        //todo instead query per login, during init fetech all user/pass and store in cache, enhace performance
        if (id.equals("12345678") && password.equals("12345678")) {
            activeUserStore.removeUserByID(id);
            Cookie cookie = new Cookie("payla_auth", Utilities.calcCookieHash("12345678"));
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        return "index";

    }
}