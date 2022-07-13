package ro.sda.javaremote37.springseed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.sda.javaremote37.springseed.entities.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
