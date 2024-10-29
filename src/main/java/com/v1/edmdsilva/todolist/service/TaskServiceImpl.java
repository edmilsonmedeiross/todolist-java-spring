package com.v1.edmdsilva.todolist.service;

import com.v1.edmdsilva.todolist.dto.TaskDto;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements ITaskService{
    @Override
    public TaskDto save(TaskDto task) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<TaskDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<TaskDto> findById(Long id) {
        return Optional.empty();
    }
}
