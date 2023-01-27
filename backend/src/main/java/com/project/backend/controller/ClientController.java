package com.project.backend.controller;

import com.project.backend.model.User;

import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @Autowired
    private UserService userService;

    //hello world
    @GetMapping("/")
    public String helloworld(){
        return "Hello World";
    }
    //Rest API Crud - Create User - Post
    //Read User = GET
    //Delete User - DELETE
    //Update User -PUT

    //Create User
    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }
    //read user
    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUser();
    }
    //Update User By Id
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user, @PathVariable("id")long id){
        return userService.updateUser(user, id);
    }
    //delete user
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id")long id){
        userService.deleteUser(id);
        return "User Deleted Sucessfully..";
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id")long id){
        return userService.getUserById(id);
    }
}
