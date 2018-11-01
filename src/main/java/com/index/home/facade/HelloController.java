package com.index.home.facade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lushengkao vip8
 * 2018/11/1 14:36
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message","hello freemanager");
        return "index";
    }

    @RequestMapping("/us")
    public String us(Model model) {
        return "get-a-quote";
    }

}
