package com.solatodo.sola_todoapp.Task.dto.request;

import com.solatodo.sola_todoapp.Task.data.model.TaskStatus;
import jdk.jfr.Category;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateTaskRequest{
    private String name;
    private Category category;
    private TaskStatus taskStatus;
    private String content;
    private String title;
    private LocalDate timestamp = LocalDate.now();
}
