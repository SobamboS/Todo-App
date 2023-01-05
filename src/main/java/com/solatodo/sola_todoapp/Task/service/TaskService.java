package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.EditTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.EditTaskResponse;

public interface TaskService{

    CreateTaskResponse createTask(CreateTaskRequest createTaskRequest);

    EditTaskResponse editTask(EditTaskRequest editTaskRequest);

    DeleteTaskResponse deleteTask(String content);

}