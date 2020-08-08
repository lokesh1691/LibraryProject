package com.hcl.library.controller;

import com.hcl.library.model.User;
import com.hcl.library.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "Login authentication")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam Long uid, @RequestParam String password) {

        boolean isValidUser = userService.validateUser(uid, password);

        if (!isValidUser) {
            return "Invalid Credentials";
        }

        return "welcome";
    }

    @ApiOperation(value = "Register new user")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String showWelcomePage(@RequestBody User u) {
        try {
            userService.registerUser(u);
        } catch (Exception ex) {
            return "failed";
        }
        return "registered";
    }
}