package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.data.model.Task;
import com.solatodo.sola_todoapp.Task.data.repository.TaskRepository;
import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.EditTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.EditTaskResponse;
import com.solatodo.sola_todoapp.Task.exception.TaskException;
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
        task.setTaskCategory(createTaskRequest.getTaskCategory());
        task.setContent(createTaskRequest.getContent());
       Task createdTask = taskRepository.save(task);
        return new CreateTaskResponse("Created", 201, task.getCreationDate());
    }

    @Override
    public EditTaskResponse editTask(EditTaskRequest editTaskRequest){
        Task editTask = taskRepository.findByContentEqualsIgnoreCase(editTaskRequest.getContent())
               .orElseThrow(()-> new TaskException("Not found"));
        if(editTask.getContent().equals(editTaskRequest.getContent())){
            editTask.setContent(editTask.getContent());
            taskRepository.save(editTask);
           return new EditTaskResponse("Updated",editTask.getCreationDate());
        }else
            return new EditTaskResponse("error Try again", editTask.getCreationDate());


    }

    @Override
    public DeleteTaskResponse deleteTask(String content){
        taskRepository.deleteByContent(content);
        return new DeleteTaskResponse("Deleted");
    }



}
