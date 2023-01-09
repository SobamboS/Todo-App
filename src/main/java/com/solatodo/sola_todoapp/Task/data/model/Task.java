package com.solatodo.sola_todoapp.Task.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;


@Data
@Document
public class Task{
    private String content;
    private LocalDateTime creationDate=LocalDateTime.now();
}