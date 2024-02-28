package kg.alatoo.libraryapp.repositories;

import kg.alatoo.libraryapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>,
        JpaRepository<Book, Long> {
}
