package myFirstWebProject.service;

import myFirstWebProject.entities.Domain;

import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */
public interface GenericService<T extends Domain> {
    void save(T entity);
    void delete(T entity);
    T findById(long id);
    List<T> findAll();

}
