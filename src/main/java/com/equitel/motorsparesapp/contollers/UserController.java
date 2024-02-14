package com.equitel.motorsparesapp.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")    
    public String details(Model model) {
        model.addAttribute(attributeName:"title", attributeValue:"Hola Mundo Spring Boot");
        model.addAttribute(attributeName:"name", attributeValue:"Fabian");
        model.addAttribute(attributeName:"lastname", attributeValue:"Fernandez");
        return "details";
    }
}
