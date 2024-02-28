package kg.alatoo.libraryapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandlerController {

//    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException exception) {
        System.out.println("Handling Not Found Exception");
        if (StringUtils.hasLength(exception.getMessage())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(exception.getMessage());
        }
        return ResponseEntity.notFound().build();
    }
}
