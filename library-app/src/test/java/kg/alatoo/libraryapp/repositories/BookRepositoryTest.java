package kg.alatoo.libraryapp.repositories;

import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import kg.alatoo.libraryapp.entities.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.TransactionSystemException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void testNullTitleBookSave() {
        Book book = Book.builder().build();

        assertThrows(TransactionSystemException.class,
                () -> bookRepository.save(book));
    }

    @Test
    @Transactional
    @Rollback
    public void testBlankTitleBookSave() {
        Book book = Book.builder()
                .title("  ")
                .build();

        assertThrows(ConstraintViolationException.class,
                () -> bookRepository.saveAndFlush(book));
    }
}