package me.enmanuel.jobboard.repository;

import me.enmanuel.jobboard.entity.JobType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 2:15 PM
 */
public interface JobTypeRepository extends CrudRepository<JobType, Integer> {
}
