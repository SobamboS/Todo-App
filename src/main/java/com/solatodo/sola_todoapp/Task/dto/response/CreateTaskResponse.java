package com.solatodo.sola_todoapp.Task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateTaskResponse{
private String message;
private int statusCode;
}