package kg.alatoo.libraryapp.services;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.entities.Book;
import kg.alatoo.libraryapp.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceJPA implements BookService {

    private final BookMapper bookMapper;

    public BookDTO testMapper(Book book) {
        return bookMapper.bookToBookDto(book);
    }
}