package com.solatodo.sola_todoapp.Task.dto.request;

import com.solatodo.sola_todoapp.Task.data.model.TaskCategory;
import com.solatodo.sola_todoapp.Task.data.model.TaskStatus;

import lombok.Data;



@Data
public class CreateTaskRequest{
    private TaskCategory taskCategory;
    private TaskStatus taskStatus;
    private String content;
}
