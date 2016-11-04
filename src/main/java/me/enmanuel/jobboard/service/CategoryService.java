package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.Category;
import me.enmanuel.jobboard.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 02-Nov-16
 * Time: 12:51 PM
 */
@org.springframework.stereotype.Service
public class CategoryService implements Service<Category> {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category findOne(Integer var1) {
        return null;
    }

    @Override
    public <S extends Category> S save(S var1) {
        return categoryRepository.save(var1);
    }

    @Override
    public void delete(Integer var1) {
        categoryRepository.delete(var1);
    }

    @Override
    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }
}
