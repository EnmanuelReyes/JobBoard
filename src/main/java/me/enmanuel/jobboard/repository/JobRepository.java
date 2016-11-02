package me.enmanuel.jobboard.repository;

import me.enmanuel.jobboard.entity.Job;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:57 PM
 */
public interface JobRepository extends PagingAndSortingRepository<Job, Integer> {
}
