package com.kgc.controller.SkController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
