package com.v1.edmdsilva.todolist.repository;

import com.v1.edmdsilva.todolist.model.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class TaskRepositoryImpl implements ITaskRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Task save(Task task) {
        if (task.getId() == null) {
            entityManager.persist(task);
            return task;
        } else {
            return entityManager.merge(task);
        }
    }

    @Override
    public void deleteById(Long id) {
        Task task = entityManager.find(Task.class, id);
        if (task != null) {
            entityManager.remove(task);
        }
    }

    @Override
    public List<Task> findAll() {
        return entityManager.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    public Optional<Task> findById(Long id) {
        Task task = entityManager.find(Task.class, id);
        return task != null ? Optional.of(task) : Optional.empty();
    }
}
