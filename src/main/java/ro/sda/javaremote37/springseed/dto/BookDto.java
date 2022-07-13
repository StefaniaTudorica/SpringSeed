package ro.sda.javaremote37.springseed.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data

public class BookDto {
    private Long id;


 private String title;
 private String author;

}
