package com.yjh.controller;

import com.yjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class MyController {
    UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        Logger log = Logger.getLogger("com.yjh.controller.MyController");
        log.warning("userService:" + userService);

        map.addAttribute("list",userService.list());

        return "/list.jsp";
    }
}
