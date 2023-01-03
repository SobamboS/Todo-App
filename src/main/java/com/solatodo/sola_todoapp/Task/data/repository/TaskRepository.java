package com.solatodo.sola_todoapp.Task.data.repository;

import com.solatodo.sola_todoapp.Task.data.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TaskRepository extends MongoRepository<Task, String>{
    Optional<Task> findByTitle(String title);

    void deleteByTitle(String title);
}
