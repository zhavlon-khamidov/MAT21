package kg.alatoo.libraryapp.bootstrap;


import kg.alatoo.libraryapp.entities.Book;
import kg.alatoo.libraryapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) {
        log.warn("Initializing data");

        //TODO: HW create at least 3 books with using lombok's @Builder and save to DB

        Book book1 = Book.builder()
                .title("Book 1")
                .isbn("543543436")
                .build();

        Book book2 = Book.builder()
                .title("Book 2")
                .isbn("54314531354354")
                .build();

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
