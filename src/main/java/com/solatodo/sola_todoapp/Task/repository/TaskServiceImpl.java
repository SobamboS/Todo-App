package com.solatodo.sola_todoapp.Task.repository;

import com.solatodo.sola_todoapp.Task.model.Task;
import com.solatodo.sola_todoapp.Task.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.request.UpdateTaskRequest;
import com.solatodo.sola_todoapp.Task.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.response.DeleteAllTaskResponse;
import com.solatodo.sola_todoapp.Task.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.response.UpdateTaskResponse;
import com.solatodo.sola_todoapp.Task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public CreateTaskResponse createTask(CreateTaskRequest createTaskRequest){
        Task task = new Task();

        return null;
    }

    @Override
    public UpdateTaskResponse updateTask(UpdateTaskRequest updateTaskRequest){
        return null;
    }

    @Override
    public DeleteTaskResponse deleteTask(String id){
        return null;
    }

    @Override
    public DeleteAllTaskResponse deleteAllTask( ){
        return null;
    }
}
