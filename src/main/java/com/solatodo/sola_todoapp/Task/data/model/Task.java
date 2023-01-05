package com.solatodo.sola_todoapp.Task.data.model;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;


@Data
@Document
//@AllArgsConstructor
public class Task{
    private String content;
    private TaskCategory taskCategory;
    private TaskStatus taskStatus;
    private LocalDateTime creationDate=LocalDateTime.now();




}
