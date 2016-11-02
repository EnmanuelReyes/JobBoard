package me.enmanuel.jobboard.repository;

import me.enmanuel.jobboard.entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 2:12 PM
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}