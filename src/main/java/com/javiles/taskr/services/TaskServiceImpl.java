package com.javiles.taskr.services;

import com.javiles.taskr.models.Task;
import com.javiles.taskr.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService
{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getTaskById(long id)
    {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent())
        {
            return task.get();
        }

        return null;
    }

    @Override
    public List<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }

    @Override
    public void saveTask(Task task)
    {
        taskRepository.save(task);
    }
}
