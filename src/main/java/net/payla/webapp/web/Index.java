package net.payla.webapp.web;

import net.payla.webapp.security.iam.ActiveUserStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Index {
    private String message;

    // store logged/logout sessions
    ActiveUserStore activeUserStore = ActiveUserStore.getInstance();

    @GetMapping("/")
    public String homepage(Model model, HttpSession httpSession) {


        model.addAttribute("msg", httpSession.getId());
        return "index";
    }

    @GetMapping("/dashboard")
    public String readAllCookies(HttpServletResponse response,
                                 HttpServletRequest request,
                                 Model model) {

        Cookie[] cookies = request.getCookies();

        model.addAttribute("cookie", cookies);
        try {
            if (activeUserStore.getUserbyID("12345678")) {

                model.addAttribute("Authentication", "SUCCESS");
            } else {
                return "error";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "dashboard";

    }

}
