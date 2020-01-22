package net.payla.webapp.api.security;

import net.payla.webapp.dao.PaylaRepo;
import net.payla.webapp.dao.UserInfo;
import net.payla.webapp.security.iam.ActiveUserStore;
import net.payla.webapp.security.iam.AuthResponce;
import net.payla.webapp.system.SystemDefine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;

@RestController
public class AuthService implements Authentication {
    ActiveUserStore activeUserStore = ActiveUserStore.getInstance();


    @Autowired
    PaylaRepo paylaRepo;


    /**
     * Registering new user
     * @param id
     * @param password
     * @param email
     * @return
     */
    @RequestMapping("/v1/register")
    public int registerNewUser(@RequestParam(required = true) Long id,
                                  @RequestParam(required = true) String password,
                                  @RequestParam(required = true) String email) throws Exception {
        //todo define custom exception that return custom 40x error for exmaple
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        paylaRepo.save(userInfo);
        return SystemDefine.SUCCESS_CODE;
    }

    @RequestMapping("/v1/remove")
    public String removeUser(@RequestParam(required = true) Long id,
                             @RequestParam(required = true) String password,
                             @RequestParam(required = true) String email) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        paylaRepo.delete(userInfo);
        return "200";
    }

    @GetMapping("/v1/login")
    public AuthResponce login(@RequestParam(required = true) String id) {

        //todo if query on db and find user then make token and return token
        AuthResponce authResponce=new AuthResponce();
        //todo fetch db and check out the result
        if (id.equals("12345678")) {
            authResponce.setToken("TOKEN-123456-0000");
            authResponce.setRetcode("200");
            return authResponce;
        } else  {
            authResponce.setToken("TOKEN-0000-0000");
            authResponce.setRetcode("404");
            return authResponce;
        }
    }

    @GetMapping("/v1/logout")
    public AuthResponce logout(HttpServletResponse response,
                         HttpServletRequest request,
                         @RequestParam(required = true) String id,
                         @RequestParam(required = true) String password) throws NoSuchAlgorithmException {

        //todo if user credentials matched in database then do below statement
        //todo instead query per login, during init fetech all user/pass and store in cache, enhace performance
        AuthResponce authResponce=new AuthResponce();
        //todo fetch db and check out the result

            authResponce.setToken("TOKEN-0000-0000");
            authResponce.setRetcode("404");
            return authResponce;



    }

    @RequestMapping("/v1/regnew")
    @Override
    public int regNewUser(@RequestParam(required = true) Long id,
                          @RequestParam(required = true) String password,
                          @RequestParam(required = true) String email) throws Exception {
        //todo define custom exception that return custom 40x error for exmaple
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        paylaRepo.save(userInfo);
        return SystemDefine.SUCCESS_CODE;
    }
}
