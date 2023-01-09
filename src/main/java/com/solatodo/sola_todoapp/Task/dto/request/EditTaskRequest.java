package com.solatodo.sola_todoapp.Task.dto.request;

import lombok.Data;

@Data
public class EditTaskRequest{
    private String newContent;

    private String content;
}
