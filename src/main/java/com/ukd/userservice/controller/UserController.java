package com.ukd.userservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ukd.userservice.controller.api.UserApi;
import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.dto.UserWithNotesDto;
import com.ukd.userservice.entity.User;
import com.ukd.userservice.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public User createUser(@Valid @RequestBody CreateUserDto user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUserName(@RequestBody @Valid CreateUserDto user, @PathVariable Long id) {
        log.info("Updating user with id: {}", id);
        return userService.updateUser(id, user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}/notes")
    public UserWithNotesDto getUserWithNotes(@PathVariable Long id) {
        return userService.getUserNotes(id);
    }
}
