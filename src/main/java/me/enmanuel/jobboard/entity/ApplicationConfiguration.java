package me.enmanuel.jobboard.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 03-Nov-16
 * Time: 5:02 PM
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name= "application_configuration")
public class ApplicationConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer frontPageMaximumJobs;
    private String locale;
    private Integer jobLifeDays;

    public ApplicationConfiguration() {
    }

    public ApplicationConfiguration(Integer id, String locale, Integer frontPageMaximumJobs, Integer jobLifeDays) {
        this.id = id;
        this.locale = locale;
        this.frontPageMaximumJobs = frontPageMaximumJobs;
        this.jobLifeDays = jobLifeDays;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrontPageMaximumJobs() {
        return frontPageMaximumJobs;
    }

    public void setFrontPageMaximumJobs(Integer frontPageMaximumJobs) {
        this.frontPageMaximumJobs = frontPageMaximumJobs;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getJobLifeDays() {
        return jobLifeDays;
    }

    public void setJobLifeDays(Integer jobLifeDays) {
        this.jobLifeDays = jobLifeDays;
    }
}
