package kg.alatoo.libraryapp.mapper;

import kg.alatoo.libraryapp.dto.BookDTO;
import kg.alatoo.libraryapp.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookDTO bookToBookDto(Book book);

    Book bookDtoToBook(BookDTO dto);

}
