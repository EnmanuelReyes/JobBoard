package me.enmanuel.jobboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 01-Nov-16
 * Time: 1:50 PM
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/jobs";
    }
}
