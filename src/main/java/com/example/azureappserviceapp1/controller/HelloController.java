package com.example.azureappserviceapp1.controller;

import com.example.azureappserviceapp1.entity.User;
import com.example.azureappserviceapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "HelloWorld";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getCustomers() {

        return userService.getEntities();
    }

    @GetMapping("/user/{userId}")
    public Optional<User> getCustomer(@PathVariable int userId) {
        return userService.getEntity(userId);
    }

    @PostMapping("/user")
    public User addCustomer(@RequestBody User user) {

        user.setId(0);
        userService.saveEntity(user);
        return user;
    }

    @PutMapping("/user")
    public User updateCustomer(@RequestBody User user) {

        userService.saveEntity(user);

        return user;
    }

    @DeleteMapping("/user/{userId}")
    public String deleteCustomer(@PathVariable int userId) {

        userService.deleteEntity(userId);

        return "Deleted user id - " + userId;
    }
}
