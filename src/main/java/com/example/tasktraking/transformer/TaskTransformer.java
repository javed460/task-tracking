package com.example.tasktraking.transformer;

import com.example.tasktraking.dto.TaskDTO;
import com.example.tasktraking.entity.Task;

import java.util.List;
import java.util.stream.Collectors;

public final class TaskTransformer {

    public static List<TaskDTO> transformToTaskList(List<Task> taskList) {
        return taskList.stream()
                .map(TaskTransformer::transformToTaskDTO)
                .collect(Collectors.toList());
    }

    public static TaskDTO transformToTaskDTO(Task task) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTitle(task.getTitle());
        taskDTO.setDescription(task.getDescription());
        return taskDTO;
    }

    public static Task transformToTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.isCompleted());
        return task;
    }
}
