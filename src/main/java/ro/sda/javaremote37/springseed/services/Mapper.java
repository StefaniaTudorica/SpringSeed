package ro.sda.javaremote37.springseed.services;

public interface Mapper <E,D>{
    D convertToDto(E entity);
    E convertToEntity(D dto);
}