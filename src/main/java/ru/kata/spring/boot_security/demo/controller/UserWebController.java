package ru.kata.spring.boot_security.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;
import java.util.Optional;


@Controller
public class UserWebController {
    private final UserService service;

    @Autowired
    public UserWebController(UserService service) {
        this.service = service;
    }


    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        User user = service.findByEmail(principal.getName());
        model.addAttribute("user", user);
        return "user";
    }
}
