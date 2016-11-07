package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.ApplicationConfiguration;
import me.enmanuel.jobboard.repository.ApplicationConfigurationRepository;
import me.enmanuel.jobboard.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 03-Nov-16
 * Time: 6:20 PM
 */
@org.springframework.stereotype.Service
public class ApplicationConfigurationService implements Service<ApplicationConfiguration> {

    @Autowired
    ApplicationConfigurationRepository applicationConfigurationRepository;

    @Override
    public ApplicationConfiguration findOne(Integer var1) {
        return applicationConfigurationRepository.findOne(var1);
    }

    @Override
    public <S extends ApplicationConfiguration> S save(S var1) {
        return applicationConfigurationRepository.save(var1);
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
