package me.enmanuel.jobboard.config;

import me.enmanuel.jobboard.entity.ApplicationConfiguration;
import me.enmanuel.jobboard.entity.Category;
import me.enmanuel.jobboard.entity.JobType;
import me.enmanuel.jobboard.repository.ApplicationConfigurationRepository;
import me.enmanuel.jobboard.repository.CategoryRepository;
import me.enmanuel.jobboard.repository.JobTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:44 PM
 */

@Configuration
@EnableJpaRepositories(basePackages = "me.enmanuel.jobboard.repository")
@EntityScan(basePackages = "me.enmanuel.jobboard.entity")
public class ApplicationDataSource {

    @Bean
    public CommandLineRunner initJobTypes(JobTypeRepository jobTypeRepository) {
        return (args) -> {
            jobTypeRepository.save(new JobType(1, "Full Time"));
            jobTypeRepository.save(new JobType(2, "Part Time"));
            jobTypeRepository.save(new JobType(3, "Freelance"));
        };
    }

    @Bean
    public CommandLineRunner initCategories(CategoryRepository categoryRepository) {
        return (args) -> {
            categoryRepository.save(new Category(1, "Remoto"));
            categoryRepository.save(new Category(2, "Java"));
            categoryRepository.save(new Category(3, "C#"));
        };
    }
    @Bean
    public CommandLineRunner initApplicationConfiguration
            (FixedLocaleResolver fixedLocaleResolver,ApplicationConfigurationRepository applicationConfigurationRepository) {
        return (args) -> {
            applicationConfigurationRepository.save(new ApplicationConfiguration(1,"ES", 30, 30));
            fixedLocaleResolver.setDefaultLocale(new Locale(applicationConfigurationRepository.findOne(1).getLocale()));
        };
    }
}
