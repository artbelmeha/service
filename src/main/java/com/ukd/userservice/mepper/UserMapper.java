package com.ukd.userservice.mepper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.ukd.userservice.client.dto.NoteDto;
import com.ukd.userservice.dto.CreateUserDto;
import com.ukd.userservice.dto.UserWithNotesDto;
import com.ukd.userservice.entity.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "прізвище")
    @Mapping(target = "active", constant = "true")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    User toEntity(CreateUserDto user);

    @Mapping(target = "notes", source = "notes")
    @Mapping(target = "lastName", source = "user.lastName")
    UserWithNotesDto toUserWithNotesDto(User user, List<NoteDto> notes);
}
