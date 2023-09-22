package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/user")
@RestController
public class UserControllerClass {
    @Autowired
    UserServiceClass userService;   //userService reference is created using UserServiceClass
    @PostMapping
    void saveUser(@RequestBody Users user) {
        try {                                      //handle the exception
            userService.saveUser(user);
        } catch (Exception e) {  
            System.err.println("An error occurred while saving the user: " + e.getMessage());
        }
    }
}


