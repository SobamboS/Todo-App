package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.request.UpdateTaskRequest;
import com.solatodo.sola_todoapp.Task.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.response.DeleteAllTaskResponse;
import com.solatodo.sola_todoapp.Task.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.response.UpdateTaskResponse;

public interface TaskService{

    CreateTaskResponse createTask(CreateTaskRequest createTaskRequest);
    UpdateTaskResponse updateTask(UpdateTaskRequest updateTaskRequest);
    DeleteTaskResponse deleteTask(String id);
    DeleteAllTaskResponse deleteAllTask();
}
