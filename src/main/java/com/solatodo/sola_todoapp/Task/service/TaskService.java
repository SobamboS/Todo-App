package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.UpdateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteAllTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.UpdateTaskResponse;

public interface TaskService{

    CreateTaskResponse createTask(CreateTaskRequest createTaskRequest);
    UpdateTaskResponse updateTask(UpdateTaskRequest updateTaskRequest);
    DeleteTaskResponse deleteTask(String title);
    DeleteAllTaskResponse deleteAllTask();
}
