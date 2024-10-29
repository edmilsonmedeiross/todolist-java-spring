package com.v1.edmdsilva.todolist.service;

import com.v1.edmdsilva.todolist.dto.TaskDto;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    TaskDto save(TaskDto task);

    void deleteById(Long id);

    List<TaskDto> findAll();

    Optional<TaskDto> findById(Long id);
}
