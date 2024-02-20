package kg.alatoo.libraryapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


//@RequiredArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    @Column(updatable = false, columnDefinition = "varchar(10)")
    private Long id;
    @Column(name = "name",unique = true,nullable = false)
    private String title;
    @Column(length = 50)
    private String isbn;
    @Builder.Default
    private int edition = 1;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
}
