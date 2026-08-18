package com.chhetriSom.taskApp.mapper;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.UpdateTaskRequest;
import com.chhetriSom.taskApp.domain.dto.CreateTaskRequestDto;
import com.chhetriSom.taskApp.domain.dto.TaskDto;
import com.chhetriSom.taskApp.domain.dto.UpdateTaskRequestDto;
import com.chhetriSom.taskApp.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);
    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);
    TaskDto toDto(Task task);
}
