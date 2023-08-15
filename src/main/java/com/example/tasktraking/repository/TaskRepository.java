package com.example.tasktraking.repository;

import com.example.tasktraking.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
