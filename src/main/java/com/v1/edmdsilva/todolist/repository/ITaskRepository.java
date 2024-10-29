package com.v1.edmdsilva.todolist.repository;

import com.v1.edmdsilva.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITaskRepository extends JpaRepository<Task, Long>, ITaskRepositoryCustom {

}
