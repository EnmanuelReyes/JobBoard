package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.ApplicationConfiguration;
import me.enmanuel.jobboard.service.ApplicationConfigurationService;
import me.enmanuel.jobboard.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 03-Nov-16
 * Time: 6:14 PM
 */
@Controller
public class ApplicationConfigurationController {


    @Autowired
    private ApplicationConfigurationService applicationConfigurationService;
    @Autowired
    private FixedLocaleResolver localeResolver;



    @RequestMapping("/application_configuration")
    public ModelAndView applicationConfiguration(ModelAndView modelAndView) {
        modelAndView.addObject("applicationConfiguration", applicationConfigurationService.findOne(1));
        modelAndView.setViewName("configuration");
        attachLocales(modelAndView.getModelMap());
        return modelAndView;
    }
    @RequestMapping(value = "/application_configuration", method = RequestMethod.POST)
    public ModelAndView applicationConfiguration(ModelAndView modelAndView, ApplicationConfiguration applicationConfiguration) {
        localeResolver.setDefaultLocale(new Locale(applicationConfiguration.getLocale()));
        applicationConfigurationService.save(applicationConfiguration);
        modelAndView.addObject("applicationConfiguration", applicationConfigurationService.findOne(1));
        modelAndView.setViewName("configuration");
        attachLocales(modelAndView.getModelMap());
        return modelAndView;
    }


    private void attachLocales(ModelMap modelMap) {
        modelMap.addAttribute("locales", Arrays.asList("EN", "ES"));
    }

}
