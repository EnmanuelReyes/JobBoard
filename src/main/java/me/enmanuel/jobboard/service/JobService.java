package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.Job;
import me.enmanuel.jobboard.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel
 * Date: 06/11/2016
 * Time: 09:59 PM
 */
@org.springframework.stereotype.Service
public class JobService  implements Service<Job>{

    @Autowired
    JobRepository jobRepository;

    @Override
    public Job findOne(Integer var1) {
        return jobRepository.findOne(var1);
    }

    @Override
    public <S extends Job> S save(S var1) {
        return jobRepository.save(var1);
    }

    @Override
    public void delete(Integer var1) {
        jobRepository.delete(var1);
    }

    @Override
    public void delete(Job entity) {
        jobRepository.delete(entity);

    }

    @Override
    public Iterable<Job> findAll() {
        return jobRepository.findAll();
    }
}

