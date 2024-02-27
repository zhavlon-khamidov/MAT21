package kg.alatoo.libraryapp.mapper;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.entities.Book;
import kg.alatoo.libraryapp.entities.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void bookToBookDto() {

        Publisher publisher = Publisher.builder()
                .id(2L)
                .name("Test Publisher")
                .build();

        Book book = Book.builder()
                .id(1L)
                .title("Test Book")
                .isbn("13543434")
                .publisher(publisher)
                .build();

        publisher.setBooks(Set.of(book));

        BookDTO dto = bookMapper.bookToBookDto(book);

        assertNotNull(dto);
        assertEquals( 1, dto.getId());
        assertEquals("Test Book", dto.getTitle());
        assertEquals("13543434", dto.getIsbn());
        assertNotNull(dto.getPublisher());
        assertEquals(2L, dto.getPublisher().getId());
        assertEquals("Test Publisher", dto.getPublisher().getName());
        System.out.println(dto.getPublisher());
    }
}