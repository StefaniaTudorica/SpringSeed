package ro.sda.javaremote37.springseed.exceptions;

public class EntityNotFoundError extends RuntimeException{
    public EntityNotFoundError(String message) {
        super(message);
    }
}