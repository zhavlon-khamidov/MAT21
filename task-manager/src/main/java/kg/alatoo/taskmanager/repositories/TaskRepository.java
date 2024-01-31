package kg.alatoo.taskmanager.repositories;

import kg.alatoo.taskmanager.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {

}
