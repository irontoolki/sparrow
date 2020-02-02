package net.payla.webapp.controller;

import net.payla.webapp.iam.ActiveUserStore;
import net.payla.webapp.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
public class Start {
    private String message;

    // store loggined/loggedout sessions
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
