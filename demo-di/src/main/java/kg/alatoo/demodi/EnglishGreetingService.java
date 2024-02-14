package kg.alatoo.demodi;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Primary
@Profile({"EN","default"})
public class EnglishGreetingService implements GreetingService {

    public EnglishGreetingService() {
        System.out.println("Creating enGreetServ");
    }

    @Override
    public String provideGreetingMessage() {
        return "Hello, World!";
    }
}
