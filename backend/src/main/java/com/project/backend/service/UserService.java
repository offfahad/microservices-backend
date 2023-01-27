package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    //create
    public User createUser(User user);

    //read users
    public List<User> getUser();

    //read user by id
    public User getUserById(long id);

    //delete user by id
    public void deleteUser(long id);

    //update user by id
    public User updateUser(User user, long id);

}
