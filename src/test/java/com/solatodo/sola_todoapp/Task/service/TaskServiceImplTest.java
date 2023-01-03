package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.data.model.TaskCategory;
import com.solatodo.sola_todoapp.Task.data.model.TaskStatus;
import com.solatodo.sola_todoapp.Task.data.repository.TaskRepository;
import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.UpdateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.solatodo.sola_todoapp.Task.data.model.TaskCategory.TODAY;
import static com.solatodo.sola_todoapp.Task.data.model.TaskStatus.FINISHED;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TaskServiceImplTest{
    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;

    private UpdateTaskRequest updateTaskRequest;

    @BeforeEach
    void setUp( ){
        CreateTaskRequest createTaskRequest=new CreateTaskRequest();
        createTaskRequest.setTitle("Go on a stroll");
        createTaskRequest.setContent("Just walk around sabo and come back");
        createTaskRequest.setTaskCategory(TODAY);
        createTaskRequest.setTaskStatus(FINISHED);
    }

    @Test
    void taskCanBeCreated( ){
        CreateTaskResponse response = taskService.createTask(new CreateTaskRequest());
    assertNull(response);
        System.out.println(response);
        assert false;
        assertEquals("Task Created",response.getMessage());

    }

    @Test
    void updateTask( ){
    }

    @Test
    void deleteTask( ){
    }

    @Test
    void deleteAllTask( ){
    }
}