package com.ukd.userservice.controller.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Validated
@Tag(name = "User Api")
public interface UserApi {

    @Operation(summary = "Create User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    User createUser(@Parameter(description = "User for creation") @Valid @RequestBody CreateUserDto user);
}
