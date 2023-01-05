package com.solatodo.sola_todoapp.Task.controller;

import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.EditTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.EditTaskResponse;
import com.solatodo.sola_todoapp.Task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class TaskController{
    @Autowired
    private TaskService taskService;

    @PostMapping("/create_task")
    public CreateTaskResponse createNote(@RequestBody CreateTaskRequest createTaskRequest){
        return taskService.createTask(createTaskRequest);
    }

    @PatchMapping("/update_task")
    public EditTaskResponse updateTask(@RequestBody EditTaskRequest updateTaskRequest){
        return taskService.editTask(updateTaskRequest);
    }

    @DeleteMapping("/delete_task")
    public DeleteTaskResponse deleteTask(@RequestBody String title){
        return taskService.deleteTask(title);

    }

}
