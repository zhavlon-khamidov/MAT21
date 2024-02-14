package kg.alatoo.demodi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("RU")
class DemoDiApplicationTests {

    @Autowired
    ApplicationContext context;

    @Autowired
    GreetingController greetingController;

    @Test
    void greetingController() {
        System.out.println(greetingController.sayHello());
    }


    @Test
    void contextLoads() {
        GreetingController greetingController = context.getBean(GreetingController.class);
        System.out.println(greetingController.sayHello());
    }

}
