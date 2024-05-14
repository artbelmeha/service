package com.ukd.userservice.service;

import java.util.List;

import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.entity.User;

public interface UserService {
    User createUser(CreateUserDto user);

    List<User> getAllUsers();

    User updateUser(Long id, CreateUserDto user);
}
