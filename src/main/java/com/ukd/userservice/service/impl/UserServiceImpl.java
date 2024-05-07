package com.ukd.userservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ukd.userservice.entity.User;
import com.ukd.userservice.repository.UserRepository;
import com.ukd.userservice.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

        private final UserRepository userRepository;

        public User createUser(User user) {
            return userRepository.save(user);
        }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
