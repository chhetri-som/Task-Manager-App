package com.chhetriSom.taskApp.service.impl;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.entity.Task;
import com.chhetriSom.taskApp.domain.entity.TaskStatus;
import com.chhetriSom.taskApp.repository.TaskRepository;
import com.chhetriSom.taskApp.service.TaskService;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();
        Task task = new Task(
            null,
            request.title(),
            request.description(),
            request.dueDate(),
            TaskStatus.OPEN,
            request.priority(),
            now,
            now
        );
        return taskRepository.save(task);
    }
}
