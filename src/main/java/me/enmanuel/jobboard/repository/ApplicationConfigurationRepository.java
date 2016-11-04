package me.enmanuel.jobboard.repository;

import me.enmanuel.jobboard.entity.ApplicationConfiguration;
import me.enmanuel.jobboard.entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 03-Nov-16
 * Time: 5:20 PM
 */
public interface ApplicationConfigurationRepository extends CrudRepository<ApplicationConfiguration, Integer> {

}