package kg.alatoo.libraryapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Publisher {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
