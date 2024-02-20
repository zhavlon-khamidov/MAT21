package kg.alatoo.libraryapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id @GeneratedValue
    private Long id;

    private String fullName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
