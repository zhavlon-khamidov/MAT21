package kg.alatoo.libraryapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long id;

    @NotNull
    @NotBlank
    private String title;
    private String isbn;
    @Builder.Default
    private int edition = 1;

    private PublisherDTO publisher;
}
