package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.JobType;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 4:27 PM
 */
public class JobTypeService implements Service<JobType>{


    @Override
    public JobType findOne(Integer var1) {
        return null;
    }

    @Override
    public <S extends JobType> S save(S var1) {
        return null;
    }

    @Override
    public void delete(Integer var1) {

    }

    @Override
    public void delete(JobType entity) {

    }

    @Override
    public Iterable<JobType> findAll() {
        return null;
    }
}
