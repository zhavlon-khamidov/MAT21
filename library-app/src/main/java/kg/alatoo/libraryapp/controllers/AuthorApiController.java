package kg.alatoo.libraryapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorApiController {

    @GetMapping("/not-found")
    public void throwNotFound() {
        throw new NotFoundException("The object not found");
    }
}
