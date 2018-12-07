package com.javiles.taskr.repositories;

import com.javiles.taskr.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>
{
}
