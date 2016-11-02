package me.enmanuel.jobboard.service;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 26-Oct-16
 * Time: 3:09 PM
 */
public interface Service<T> {
    T findOne(Integer var1);

    <S extends T> S save(S var1);

    void delete(Integer var1);

    void delete(T entity);

    Iterable<T> findAll();

}
