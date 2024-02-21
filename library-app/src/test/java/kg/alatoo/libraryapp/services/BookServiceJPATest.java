package kg.alatoo.libraryapp.services;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.entities.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceJPATest {

    @Autowired
    BookServiceJPA bookServiceJPA;

    @Test
    void testMapper() {

        Book book = Book.builder()
                .id(1L)
                .title("Test Book")
                .isbn("13543434")
                .build();

        BookDTO dto = bookServiceJPA.testMapper(book);

        assertNotNull(dto);
        assertEquals( 1, dto.getId());
        assertEquals("Test Book", dto.getTitle());
        assertEquals("13543434", dto.getIsbn());
    }
}