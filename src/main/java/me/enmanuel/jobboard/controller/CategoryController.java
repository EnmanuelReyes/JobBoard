package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.Category;
import me.enmanuel.jobboard.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 02-Nov-16
 * Time: 12:50 PM
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public ModelAndView categories(ModelAndView modelAndView) {
        modelAndView.addObject("categories", categoryService.findAll());
        modelAndView.setViewName("categories");
        return modelAndView;
    }


    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ModelAndView save(ModelAndView modelAndView, Category category, RedirectAttributes redirectAttributes) {
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("success", "El usuario fue guardado correctamente");
        modelAndView.setViewName("redirect:/categories");

        return modelAndView;
    }

    @RequestMapping(value = "/category/{categoryId}")
    public ModelAndView edit(ModelAndView modelAndView, @PathVariable("categoryId") Category category) {

        modelAndView.setViewName("category");
        modelAndView.addObject("category", category);
        return modelAndView;
    }

    @RequestMapping(value = "/category/create")
    public ModelAndView create(ModelAndView modelAndView) {

        modelAndView.setViewName("category");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @RequestMapping(value = "/category/delete/{categoryId}")
    public ModelAndView delete(ModelAndView modelAndView, @PathVariable Integer categoryId,
                               RedirectAttributes redirectAttributes) {
        categoryService.delete(categoryId);
        redirectAttributes.addFlashAttribute("success", "La categoria fue eliminado correctamente");
        modelAndView.setViewName("redirect:/categories");
        return modelAndView;
    }
}
