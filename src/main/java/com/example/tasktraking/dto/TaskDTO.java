package com.example.tasktraking.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class TaskDTO {
    private String title;
    private String description;
    private boolean completed;
}
