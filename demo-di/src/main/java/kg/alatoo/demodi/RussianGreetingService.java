package kg.alatoo.demodi;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Profile("RU")
public class RussianGreetingService implements GreetingService{

    public RussianGreetingService() {
        System.out.println("Creating ruGreetServ");
    }

    @Override
    public String provideGreetingMessage() {
        return "Привет, Мир!";
    }
}
