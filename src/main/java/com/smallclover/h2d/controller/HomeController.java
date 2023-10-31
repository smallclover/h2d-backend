package com.smallclover.h2d.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshun
 */
@RestController
public class HomeController {

    @GetMapping("/index")
    public String index(){
        return "HelloWorld";
    }

}
