package com.ukd.userservice.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ukd.userservice.client.dto.NoteDto;

@FeignClient(name = "note-service")
public interface NotesClient {

    @GetMapping("/api/v1/notes/user/{userId}")
    List<NoteDto> getNoteByUserId(@PathVariable Long userId);
}
