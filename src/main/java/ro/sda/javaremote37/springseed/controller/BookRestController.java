package ro.sda.javaremote37.springseed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.javaremote37.springseed.dto.BookDto;
import ro.sda.javaremote37.springseed.entities.Book;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookRestController {

    @GetMapping
    public List<BookDto> getAllBooks(){

    }
}
