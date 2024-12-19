package com.properties.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebMethods {
    @RequestMapping("/index")
    public ModelAndView index(UserDetails ud) {
        ModelAndView model = new ModelAndView();
        model.addObject("details",ud);
        model.setViewName("index");
        return model;
    }
}