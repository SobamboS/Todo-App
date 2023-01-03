package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.exception.TaskException;
import com.solatodo.sola_todoapp.Task.data.model.Task;
import com.solatodo.sola_todoapp.Task.data.repository.TaskRepository;
import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.UpdateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteAllTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.UpdateTaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public CreateTaskResponse createTask(CreateTaskRequest createTaskRequest){
        Task task = new Task();
        task.setTaskStatus(createTaskRequest.getTaskStatus());
        task.setCategory(createTaskRequest.getCategory());
        task.setContent(createTaskRequest.getContent());
       Task createdTask = taskRepository.save(task);
        return new CreateTaskResponse("Task created", 201);
    }

    @Override
    public UpdateTaskResponse updateTask(UpdateTaskRequest updateTaskRequest){
        Task updatedTask = taskRepository.findByTitle(updateTaskRequest.getTitle())
                .orElseThrow(()-> new TaskException("Task not found"));
        if(updatedTask.getTitle().equals(updateTaskRequest.getTitle())){
            taskRepository.save(updatedTask);
            return new UpdateTaskResponse("updated successfully");
        }else
           return new UpdateTaskResponse("Please try again");
    }

    @Override
    public DeleteTaskResponse deleteTask(String title){
        taskRepository.deleteByTitle(title);
        return new DeleteTaskResponse("Task deleted");
    }

    @Override
    public DeleteAllTaskResponse deleteAllTask( ){
        taskRepository.deleteAll();
        return new DeleteAllTaskResponse("Deleted");
    }
}
