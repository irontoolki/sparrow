package net.payla.webapp.web.controler;

import net.payla.webapp.dao.PaylaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class category {
    @Autowired
    PaylaRepo paylaRepo;

    @GetMapping("/category")
    public String category() {

        return "catalog/product/category";
    }

}
