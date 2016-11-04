package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.Job;
import me.enmanuel.jobboard.service.CategoryService;
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

    @RequestMapping(value = "/job/create", method = RequestMethod.POST)
    public String createJob(ModelAndView modelAndView, Job job) {
        modelAndView.addObject("job", new Job());
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        return "create";
    }

    private void attachCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryService.findAll());
    }

    private void attachJobTypes(ModelMap modelMap) {
        modelMap.addAttribute("jobTypes", jobTypeService.findAll());
    }

}
