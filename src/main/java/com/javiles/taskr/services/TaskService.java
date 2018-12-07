package com.javiles.taskr.services;

import com.javiles.taskr.models.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface TaskService
{
    Task getTaskById(long id);

    List<Task> getAllTasks();

    void saveTask(Task task);
}
