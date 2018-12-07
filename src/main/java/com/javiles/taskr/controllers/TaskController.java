package com.javiles.taskr.controllers;

import com.javiles.taskr.models.Task;
import com.javiles.taskr.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController
{
    @Autowired
    TaskService taskService;

    @GetMapping("/{id}")
    ResponseEntity<?> getTask(@PathVariable("id") String id)
    {
        Task task = taskService.getTaskById(Long.parseLong(id));
        return new ResponseEntity<>(task, HttpStatus.FOUND);
    }
}
