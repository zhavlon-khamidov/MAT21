package kg.alatoo.taskmanager.controllers;

import kg.alatoo.taskmanager.entities.Task;
import kg.alatoo.taskmanager.repositories.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {

    private final TaskRepository taskRepository;

    public ApiController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("task")
    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    @GetMapping("task/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        return optionalTask
                .map(task -> ResponseEntity.ok().body(task))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

//    @RequestMapping(method = RequestMethod.POST, path = "task")
    @PostMapping("task")
    public Task createTask(@RequestBody Task task) {
        task.setId(null);
        return taskRepository.save(task);
    }

    @PutMapping("task/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable Long id) {
        if (!taskRepository.existsById(id)) {
            throw new NoSuchElementException();
        }
        task.setId(id);
        return taskRepository.save(task);
    }

    @DeleteMapping("task/{id}")
    public ResponseEntity<Task> deleteTaskById(@PathVariable Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            taskRepository.deleteById(id);
            return ResponseEntity.ok().body(optionalTask.get());
        }

        return ResponseEntity.notFound().build();
    }

    //TODO: Create PATCH request for update


}
