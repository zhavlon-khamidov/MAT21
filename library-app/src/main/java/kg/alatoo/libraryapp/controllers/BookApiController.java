package kg.alatoo.libraryapp.controllers;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;


    @PostMapping("/api/v1/book")
    public ResponseEntity<BookDTO> createBook(@Validated @RequestBody BookDTO bookDTO) {
        return ResponseEntity.created(URI.create("/api/v1/book/" + 1)).body(bookDTO);
    }

    @GetMapping("/api/v1/book/{id}")
    public BookDTO getBook(@PathVariable Long id) {

        /*BookDTO dto = bookService.getBookById(id).orElse(null);
        if (dto != null) {
            return dto;
        } else {
            throw new NoSuchElementException();
        }*/

        return bookService
                .getBookById(id)
//                .orElseThrow(NoSuchElementException::new);
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
                .orElseThrow(NotFoundException::new);
    }



}
