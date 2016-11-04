package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.ApplicationConfiguration;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 03-Nov-16
 * Time: 6:20 PM
 */
@org.springframework.stereotype.Service
public class ApplicationConfigurationService implements Service<ApplicationConfiguration> {
    @Override
    public ApplicationConfiguration findOne(Integer var1) {
        return null;
    }

    @Override
    public <S extends ApplicationConfiguration> S save(S var1) {
        return null;
    }

    @Override
    public void delete(Integer var1) {

    }

    @Override
    public void delete(ApplicationConfiguration entity) {

    }

    @Override
    public Iterable<ApplicationConfiguration> findAll() {
        return null;
    }
}
