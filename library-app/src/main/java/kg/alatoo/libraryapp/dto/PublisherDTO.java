package kg.alatoo.libraryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PublisherDTO {

    private long id;
    private String name;
    private String email;

    private Set<Long> bookIds;
}
