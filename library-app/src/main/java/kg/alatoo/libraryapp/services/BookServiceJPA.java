package kg.alatoo.libraryapp.services;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.entities.Book;
import kg.alatoo.libraryapp.mapper.BookMapper;
import kg.alatoo.libraryapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceJPA implements BookService {

    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    public BookDTO testMapper(Book book) {
        return bookMapper.bookToBookDto(book);
    }

    @Override
    public Optional<BookDTO> getBookById(Long id) {
        return Optional.ofNullable(
                bookMapper.bookToBookDto(
                        bookRepository.findById(id)
                                .orElse(null)
                )
        );
    }
}
