package com.chhetriSom.taskApp.service;

import com.chhetriSom.taskApp.domain.CreateTaskRequest;
import com.chhetriSom.taskApp.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
