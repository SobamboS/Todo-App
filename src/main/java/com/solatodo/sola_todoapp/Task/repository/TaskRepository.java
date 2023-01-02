package com.solatodo.sola_todoapp.Task.repository;

import com.solatodo.sola_todoapp.Task.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TaskRepository extends MongoRepository<Task, String>{
    Optional<Task> findByName(String name);
}
