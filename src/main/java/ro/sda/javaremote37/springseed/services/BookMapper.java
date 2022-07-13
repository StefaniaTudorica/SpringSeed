package ro.sda.javaremote37.springseed.services;

import ro.sda.javaremote37.springseed.dto.BookDto;
import ro.sda.javaremote37.springseed.entities.Book;

public class BookMapper implements Mapper<Book, BookDto> {
    @Override
    public BookDto convertToDto(Book entity) {
        return null;
    }

    @Override
    public Book convertToEntity(BookDto dto) {
        return null;
    }
}
