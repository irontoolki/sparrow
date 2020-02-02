package net.payla.webapp.api;

import net.payla.webapp.controller.PaylaRepo;
import net.payla.webapp.dao.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthService {
    @Autowired
    PaylaRepo paylaRepo;

    @RequestMapping("/v1/regiter")
    public String registerNewUser(@RequestParam(required = true) Long id,
                                  @RequestParam(required = true) String password,
                                  @RequestParam(required = true) String email) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setPassword(password);
        userInfo.setEmail(email);
        paylaRepo.save(userInfo);
        return "200";
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

}
