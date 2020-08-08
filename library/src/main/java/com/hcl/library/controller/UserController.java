package com.hcl.library.controller;

import com.hcl.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam String name, @RequestParam String password){

        boolean isValidUser = userService.validateUser(name, password);

        if (!isValidUser) {
            return "Invalid Credentials";
        }

        return "welcome";
    }
}
