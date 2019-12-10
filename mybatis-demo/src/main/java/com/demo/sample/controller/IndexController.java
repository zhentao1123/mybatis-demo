package com.demo.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController{

	@RequestMapping()
    public String swagger() {
        return "redirect:swagger-ui.html";
    }
}
