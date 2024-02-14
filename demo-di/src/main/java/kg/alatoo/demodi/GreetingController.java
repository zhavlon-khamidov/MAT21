package kg.alatoo.demodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private String myText;

//    @Autowired
    private GreetingService greetingService;

    /*public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }*/

    public String sayHello() {
        System.out.println("Inside GreetingController");

        return greetingService.provideGreetingMessage();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setter based Dependency injection");
        this.greetingService = greetingService;
    }

    @Value("${my.text}")
    public void setMyText(String myText) {
        this.myText = myText;
        System.out.println("myText = " + myText);
    }
}
