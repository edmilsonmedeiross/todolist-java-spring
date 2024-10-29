package com.v1.edmdsilva.todolist.repository;

import com.v1.edmdsilva.todolist.model.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskRepositoryCustom {
    Task save(Task task);

    void deleteById(Long id);

    List<Task> findAll();

    Optional<Task> findById(Long id);
}
