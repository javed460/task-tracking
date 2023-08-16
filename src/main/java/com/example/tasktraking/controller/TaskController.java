package com.example.tasktraking.controller;

import com.example.tasktraking.dto.TaskDTO;
import com.example.tasktraking.entity.Task;
import com.example.tasktraking.service.TaskService;
import com.example.tasktraking.transformer.TaskTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.tasktraking.transformer.TaskTransformer.transformToTask;
import static com.example.tasktraking.transformer.TaskTransformer.transformToTaskList;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<TaskDTO> getAllTasks() {
        List<Task> taskList = taskService.findAll();
        return transformToTaskList(taskList);
    }

    @PostMapping
    public Integer createTask(@RequestBody TaskDTO taskDTO) {
        Task task = transformToTask(taskDTO);
        return taskService.create(task);
    }
}
