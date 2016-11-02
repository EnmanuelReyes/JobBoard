package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:43 PM
 */
@Controller
public class JobController {

    @RequestMapping("/jobs")
    public String index() {
        return "jobs";
    }
    @RequestMapping("/job")
    public String job() {
        return "job";
    }

    @RequestMapping("/job/create")
    public String createJob(ModelAndView modelAndView) {
        modelAndView.addObject("job", new Job());
        attachJobTypes(modelAndView.getModelMap());
        attachCategories(modelAndView.getModelMap());
        return "create";
    }

    private void attachCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", Arrays.asList());
    }

    private void attachJobTypes(ModelMap modelMap) {
        modelMap.addAttribute("jobTypes", Arrays.asList());
    }

}
