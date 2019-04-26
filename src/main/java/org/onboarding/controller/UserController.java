package org.onboarding.controller;

import org.onboarding.entity.User;
import org.onboarding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:http://localhost:8080/";    
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
    public String delete(@RequestParam String id) {
        long delID = Long.parseLong(id);
        userService.delete(delID);
        return "redirect:http://localhost:8080/";    
    }
}
