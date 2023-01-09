package com.solatodo.sola_todoapp.Task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CreateTaskResponse{
    private String content;
private String message;
private int statusCode;
private LocalDateTime creationDate = LocalDateTime.now();

}
