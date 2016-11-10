package me.enmanuel.jobboard.controller;

import me.enmanuel.jobboard.entity.Affiliate;
import me.enmanuel.jobboard.service.AffiliateService;
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
 * Date: 09-Nov-16
 * Time: 4:09 PM
 */
@Controller
public class AffiliateController {
    @Autowired
    private AffiliateService affiliateService;

    @RequestMapping("/affiliates")
    public ModelAndView affiliates(ModelAndView modelAndView) {
        modelAndView.addObject("affiliates", affiliateService.findAll());
        modelAndView.setViewName("affiliates");
        return modelAndView;
    }


    @RequestMapping(value = "/affiliate", method = RequestMethod.POST)
    public ModelAndView save(ModelAndView modelAndView, Affiliate affiliate, RedirectAttributes redirectAttributes) {
        affiliateService.save(affiliate);
        redirectAttributes.addFlashAttribute("success", "El afiliado fue guardado correctamente");
        modelAndView.setViewName("redirect:/affiliates");

        return modelAndView;
    }

    @RequestMapping(value = "/affiliate/{affiliateId}")
    public ModelAndView edit(ModelAndView modelAndView, @PathVariable("affiliateId") Affiliate affiliate) {

        modelAndView.setViewName("affiliate");
        modelAndView.addObject("affiliate", affiliate);
        return modelAndView;
    }

    @RequestMapping(value = "/affiliate/create")
    public ModelAndView create(ModelAndView modelAndView) {

        modelAndView.setViewName("affiliate");
        modelAndView.addObject("affiliate", new Affiliate());
        return modelAndView;
    }

    @RequestMapping(value = "/affiliate/activate/{affiliateId}")
    public ModelAndView activate(ModelAndView modelAndView, @PathVariable("affiliateId") Affiliate affiliate,
                                 RedirectAttributes redirectAttributes) {
        affiliateService.activate(affiliate);
        redirectAttributes.addFlashAttribute("success", "El afiliado fue activado correctamente");
        modelAndView.setViewName("redirect:/affiliates");
        return modelAndView;
    }

    @RequestMapping(value = "/affiliate/deactivate/{affiliateId}")
    public ModelAndView deactivate(ModelAndView modelAndView, @PathVariable("affiliateId") Affiliate affiliate,
                                 RedirectAttributes redirectAttributes) {
        affiliateService.deactivate(affiliate);
        redirectAttributes.addFlashAttribute("success", "El afiliado fue desactivado correctamente");
        modelAndView.setViewName("redirect:/affiliates");
        return modelAndView;
    }

    @RequestMapping(value = "/affiliate/delete/{affiliateId}")
    public ModelAndView delete(ModelAndView modelAndView, @PathVariable Integer affiliateId,
                               RedirectAttributes redirectAttributes) {
        affiliateService.delete(affiliateId);
        redirectAttributes.addFlashAttribute("success", "El afiliado fue eliminado correctamente");
        modelAndView.setViewName("redirect:/affiliates");
        return modelAndView;
    }
}
