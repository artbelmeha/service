package com.ukd.userservice.dto;

import java.util.List;

import com.ukd.userservice.client.dto.NoteDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWithNotesDto {
    private String firstName;
    private String lastName;
    private String email;
    private List<NoteDto> notes;
}
