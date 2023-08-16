package com.example.tasktraking.service;

import com.example.tasktraking.entity.Task;
import com.example.tasktraking.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Integer create(Task task) {
        Task savedTask = taskRepository.save(task);
        return savedTask.getId().intValue();
    }
}
