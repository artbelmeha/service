package com.ukd.userservice.mepper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.entity.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "прізвище")
    @Mapping(target = "active", constant = "true")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    User toEntity(CreateUserDto user);
}
