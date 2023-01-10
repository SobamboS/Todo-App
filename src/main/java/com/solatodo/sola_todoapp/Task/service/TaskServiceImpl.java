package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.data.model.Task;
import com.solatodo.sola_todoapp.Task.data.repository.TaskRepository;
import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.EditTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.EditTaskResponse;
import com.solatodo.sola_todoapp.Task.exception.UpdateTaskException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{


    @Autowired
    private TaskRepository taskRepository;
    @Override
    public CreateTaskResponse createTask(CreateTaskRequest createTaskRequest){
        Task task = new Task();
        task.setContent(createTaskRequest.getContent());
       task.setCreationDate(createTaskRequest.getCreationDate());
       Task createdTask = taskRepository.save(task);
        return new CreateTaskResponse(createdTask.getContent(),"Created", 201,createdTask.getCreationDate());
    }

    @Override
    public EditTaskResponse editTask(EditTaskRequest editTaskRequest){
        Task editTask = taskRepository.findByContentEqualsIgnoreCase(editTaskRequest.getContent());
        if(editTask == null) throw  new UpdateTaskException(String.format("%s does not exist", editTaskRequest.getContent()));
        editTask.setContent(editTaskRequest.getNewContent());
        editTask.setCreationDate(editTaskRequest.getNewDate());
           taskRepository.save(editTask);
           return new EditTaskResponse(editTask.getContent(),"Edited",editTask.getCreationDate());

    }

    @Override
    public DeleteTaskResponse deleteTask(String content){
        taskRepository.deleteByContent(content);
        return new DeleteTaskResponse("Deleted");
    }



}
