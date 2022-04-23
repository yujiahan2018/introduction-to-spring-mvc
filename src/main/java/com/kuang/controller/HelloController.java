package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(String name, ModelMap model){
        model.addAttribute("name",name);

        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        System.out.println(name);

        return "index.jsp";
    }
}