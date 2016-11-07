package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.Job;
import me.enmanuel.jobboard.service.CategoryService;
import me.enmanuel.jobboard.service.JobService;
import me.enmanuel.jobboard.service.JobTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:43 PM
 */
@Controller
public class JobController {

    @Autowired
    JobTypeService jobTypeService;
    @Autowired
    JobService jobService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    private MessageSource messageSource;


    @RequestMapping("/jobs")
    public String index() {
        return "jobs";
    }

    @RequestMapping("/job")
    public String job() {
        return "job";
    }

    @RequestMapping("/job/create")
    public ModelAndView createJob(ModelAndView modelAndView) {
        modelAndView.addObject("job", new Job());
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        modelAndView.setViewName("create");
        return modelAndView;
    }

    @RequestMapping(value = "/job/preview", method = RequestMethod.POST)
    public ModelAndView previewJob(ModelAndView modelAndView, Job job) {
        job.setJobType(jobTypeService.findOne(job.getJobType().getId()));
        modelAndView.addObject("job", job);
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        modelAndView.setViewName("job");
        return modelAndView;
    }

    @RequestMapping(value = "/job/submit", method = RequestMethod.POST)
    public ModelAndView createJob(ModelAndView modelAndView, Job job) {
        jobService.save(job);
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        modelAndView.setViewName("jobs");
        return modelAndView;
    }
    @RequestMapping(value = "/job/submit", params = "edit",method = RequestMethod.POST)
    public ModelAndView editPreviewJob(ModelAndView modelAndView, Job job) {
        modelAndView.addObject("job", job);
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        modelAndView.setViewName("create");
        return modelAndView;
    }

    private void attachCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryService.findAll());
    }

    private void attachJobTypes(ModelMap modelMap) {
        modelMap.addAttribute("jobTypes", jobTypeService.findAll());
    }

}
