package com.index.home.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lushengkao vip8
 * 2018/11/1 14:36
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

}
