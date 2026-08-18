package com.chhetriSom.taskApp.domain.dto;

import com.chhetriSom.taskApp.domain.entity.TaskPriority;
import com.chhetriSom.taskApp.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
