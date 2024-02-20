package kg.alatoo.libraryapp.entities;

import lombok.*;


//@RequiredArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Builder
public class Book {
    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private String isbn;
    @Builder.Default
    private int edition = 1;

}
