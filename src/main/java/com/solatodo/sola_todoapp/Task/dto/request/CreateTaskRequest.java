package com.solatodo.sola_todoapp.Task.dto.request;



import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CreateTaskRequest{
    private String content;
    private LocalDateTime creationDate=LocalDateTime.now();
}
