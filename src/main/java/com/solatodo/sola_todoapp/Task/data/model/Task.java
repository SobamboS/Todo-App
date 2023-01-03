package com.solatodo.sola_todoapp.Task.data.model;

import jdk.jfr.Category;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Task{
    private String title;
    private String content;
    private TaskCategory taskCategory;
    private TaskStatus taskStatus;
//    private LocalDate creationDate=LocalDate.now();
//    private LocalDate creationTime = LocalDate.now();



}
