package kg.alatoo.demodi;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    public String sayHello() {
        System.out.println("Inside GreetingController");

        return "Hello, World!";
    }
}
