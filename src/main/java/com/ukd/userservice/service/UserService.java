package com.ukd.userservice.service;

import java.util.List;

import com.ukd.userservice.entity.User;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();
}
