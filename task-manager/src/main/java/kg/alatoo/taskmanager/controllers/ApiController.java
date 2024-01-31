package kg.alatoo.taskmanager.controllers;

import kg.alatoo.taskmanager.entities.Task;
import kg.alatoo.taskmanager.repositories.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final TaskRepository taskRepository;

    public ApiController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/api/v1/task")
    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
