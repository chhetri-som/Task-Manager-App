package com.chhetriSom.taskApp.service;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.UpdateTaskRequest;
import com.chhetriSom.taskApp.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
