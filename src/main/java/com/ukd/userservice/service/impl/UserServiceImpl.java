package com.ukd.userservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.entity.User;
import com.ukd.userservice.mepper.UserMapper;
import com.ukd.userservice.repository.UserRepository;
import com.ukd.userservice.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User createUser(CreateUserDto user) {
        return userRepository.save(userMapper.toEntity(user));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User updateUser(Long id, CreateUserDto updateUser) {
        var user = userRepository.getReferenceById(id);
        user.setFirstName(updateUser.getName());
        user.setLastName(updateUser.getПрізвище());
        user.setEmail(updateUser.getEmail());
        return userRepository.save(user);
    }
}
