package com.chhetriSom.taskApp.domain;

import com.chhetriSom.taskApp.domain.entity.TaskPriority;
import com.chhetriSom.taskApp.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
