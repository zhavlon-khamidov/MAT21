package kg.alatoo.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoDiApplication.class, args);

        GreetingController greetingController = context.getBean(GreetingController.class);

        System.out.println(greetingController.sayHello());
    }

}
