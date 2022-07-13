package ro.sda.javaremote37.springseed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.sda.javaremote37.springseed.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
