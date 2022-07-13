package ro.sda.javaremote37.springseed.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;

}
