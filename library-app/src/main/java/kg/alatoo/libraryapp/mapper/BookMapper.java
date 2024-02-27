package kg.alatoo.libraryapp.mapper;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.dto.PublisherDTO;
import kg.alatoo.libraryapp.entities.Book;
import kg.alatoo.libraryapp.entities.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BookMapper {

    BookDTO bookToBookDto(Book book);


//    @Mapping(target = "publisher", ignore = true)
    @Mapping(target = "authors", ignore = true)
    Book bookDtoToBook(BookDTO dto);


    @Mapping(target = "bookIds", source = "books")
    PublisherDTO fromPublisher(Publisher publisher);

    default Long getBookId(Book book) {
        return book.getId();
    }

}
