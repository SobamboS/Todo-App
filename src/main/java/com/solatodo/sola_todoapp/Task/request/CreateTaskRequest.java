package com.solatodo.sola_todoapp.Task.request;

import jdk.jfr.Category;
import lombok.Data;

@Data
public class CreateTaskRequest{
    private String name;
    private Category category;
    private String status;
}
