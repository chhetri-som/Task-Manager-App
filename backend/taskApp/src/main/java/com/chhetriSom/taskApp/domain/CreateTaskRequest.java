package com.chhetriSom.taskApp.domain;

import com.chhetriSom.taskApp.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
) {
}
