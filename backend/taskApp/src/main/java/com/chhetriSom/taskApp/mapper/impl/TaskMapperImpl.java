package com.chhetriSom.taskApp.mapper.impl;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.dto.CreateTaskRequestDto;
import com.chhetriSom.taskApp.domain.dto.TaskDto;
import com.chhetriSom.taskApp.domain.entity.Task;
import com.chhetriSom.taskApp.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
          dto.title(),
          dto.description(),
          dto.dueDate(),
          dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
