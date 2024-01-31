package kg.alatoo.taskmanager;

import kg.alatoo.taskmanager.entities.Task;
import kg.alatoo.taskmanager.repositories.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner bootstrapData(TaskRepository taskRepository) {

		// Creating anonymous class
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Bootstrap Data Initialized");

				// create some tasks and save them to database

				Task task1 = new Task();
				task1.setTitle("Task 1");
				task1.setDescription("Hello World");

				Task task2 = new Task();
				task2.setTitle("Task 2");
				task2.setDescription("Hello MAT21");

				System.out.println(taskRepository.save(task1));
				System.out.println(taskRepository.save(task2));
			}
		};
	}

}


