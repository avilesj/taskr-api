package com.javiles.taskr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(value = {"com.javiles.taskr.repositories"})
public class Taskr
{

    public static void main(String[] args)
    {
        SpringApplication.run(Taskr.class, args);
    }

}

