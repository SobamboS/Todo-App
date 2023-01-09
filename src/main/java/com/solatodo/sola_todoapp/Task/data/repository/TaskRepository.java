package com.solatodo.sola_todoapp.Task.data.repository;

import com.solatodo.sola_todoapp.Task.data.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends MongoRepository<Task, String>{
    Task findByContentEqualsIgnoreCase(String content);

    void deleteByContent(String content);

   // List<Task> getAllTasks(String content);
}
