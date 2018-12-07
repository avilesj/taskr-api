package com.javiles.taskr.services;

import com.javiles.taskr.models.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class TaskServiceTests
{
    @Autowired
    private TaskService taskService;

    @Test
    public void shouldStoreAndRetrieveTask()
    {
        Task task = new Task();
        task.setDescription("Just one task!");
        taskService.saveTask(task);
        Task dbTask = taskService.getTaskById(task.getId());

        assertNotNull(dbTask);
    }
}
