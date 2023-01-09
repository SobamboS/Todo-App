package com.solatodo.sola_todoapp.Task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EditTaskResponse{
    private String message;
   // private LocalDateTime creationDate = LocalDateTime.now();
}
