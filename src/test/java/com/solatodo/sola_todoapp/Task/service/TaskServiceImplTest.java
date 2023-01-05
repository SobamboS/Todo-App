package com.solatodo.sola_todoapp.Task.service;

import com.solatodo.sola_todoapp.Task.dto.request.CreateTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.request.EditTaskRequest;
import com.solatodo.sola_todoapp.Task.dto.response.CreateTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.DeleteTaskResponse;
import com.solatodo.sola_todoapp.Task.dto.response.EditTaskResponse;
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

    private CreateTaskRequest createTaskRequest;
    private EditTaskRequest editTaskRequest;

    @BeforeEach
    void setUp( ){
        createTaskRequest = new CreateTaskRequest();
        createTaskRequest.setContent("Just walk around sabo and come back");
        createTaskRequest.setTaskCategory(TODAY);
        createTaskRequest.setTaskStatus(FINISHED);

        editTaskRequest = new EditTaskRequest();

    }

    @Test
    void taskCanBeCreated( ){
        CreateTaskResponse response = taskService.createTask(createTaskRequest);
        assertNotNull(response);
        System.out.println(response);
        assertEquals("Created",response.getMessage());

    }

    @Test
    void canUpdateTask( ){
        editTaskRequest.setContent("Just walk around ");
        EditTaskResponse editTaskResponse = taskService.editTask(editTaskRequest);
        System.out.println(editTaskResponse);
        assertEquals("Created", editTaskResponse.getMessage());
    }

    @Test
    void canDeleteTask( ){
        DeleteTaskResponse deleteTaskResponse = taskService.deleteTask("Just walk around sabo and come back");
        System.out.println(deleteTaskResponse);
        assertEquals("", deleteTaskResponse.getMessage());
    }

}
