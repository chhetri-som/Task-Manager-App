package com.chhetriSom.taskApp.service.impl;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.UpdateTaskRequest;
import com.chhetriSom.taskApp.domain.entity.Task;
import com.chhetriSom.taskApp.domain.entity.TaskStatus;
import com.chhetriSom.taskApp.exception.TaskNotFoundException;
import com.chhetriSom.taskApp.repository.TaskRepository;
import com.chhetriSom.taskApp.service.TaskService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "created"));
    }

    @Override
    public Task updateTask(UUID taskId, UpdateTaskRequest request) {
        Task task = taskRepository.findById(taskId)
            .orElseThrow(() -> new TaskNotFoundException(taskId));

        task.setTitle(request.title());
        task.setDescription(request.description());
        task.setDueDate(request.dueDate());
        task.setStatus(request.status());
        task.setPriority(request.priority());
        task.setUpdated(Instant.now());

        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(UUID taskId) {
        taskRepository.deleteById(taskId);
    }
}
