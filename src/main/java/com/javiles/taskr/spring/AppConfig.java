package com.javiles.taskr.spring;

import com.javiles.taskr.services.TaskService;
import com.javiles.taskr.services.TaskServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public TaskService taskService()
    {
        return new TaskServiceImpl();
    }
}
