package kg.alatoo.libraryapp.bootstrap;


import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Log4j2
//@Log
public class InitData implements CommandLineRunner {

    @Override
    public void run(String... args) {
//        System.out.println("Initializing data");
        log.atWarn().log("Initializing data");
//        log.warning("Initializing data");

        //TODO: HW create at least 3 books with using lombok's @Builder and save to DB
    }
}
