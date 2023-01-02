package com.solatodo.sola_todoapp.Task.model;

import jdk.jfr.Category;
import lombok.Data;

import java.time.LocalDate;


@Data
public class Task{
    private String title;
    private String content;
    private Category category;
    private TaskStatus taskStatus;
    private LocalDate timeStamp=LocalDate.now();



}
