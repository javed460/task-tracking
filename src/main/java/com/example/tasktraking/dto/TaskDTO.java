package com.example.tasktraking.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class TaskDTO {
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;
}
