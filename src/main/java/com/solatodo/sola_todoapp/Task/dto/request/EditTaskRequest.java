package com.solatodo.sola_todoapp.Task.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EditTaskRequest{
    private String newContent;
    private String content;
    private LocalDateTime newDate = LocalDateTime.now();
}
