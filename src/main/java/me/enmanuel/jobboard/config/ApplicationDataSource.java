package me.enmanuel.jobboard.config;

import me.enmanuel.jobboard.entity.Category;
import me.enmanuel.jobboard.entity.Job;
import me.enmanuel.jobboard.entity.JobType;
import me.enmanuel.jobboard.repository.JobRepository;
import me.enmanuel.jobboard.repository.JobTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
    public CommandLineRunner demo(JobTypeRepository jobTypeRepository) {
        return (args) -> {
           jobTypeRepository.save(new JobType(1, "Full Time"));
           jobTypeRepository.save(new JobType(2, "Part Time"));
           jobTypeRepository.save(new JobType(3, "Freelance"));
        };
    }
}
