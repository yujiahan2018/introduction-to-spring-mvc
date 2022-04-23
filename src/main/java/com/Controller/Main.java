package com.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping("Main")
public class Main {

    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest hsrt, HttpServletResponse hsre){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Hello,MVC!");
        mv.setViewName("hello");

        return mv;
    }
}
