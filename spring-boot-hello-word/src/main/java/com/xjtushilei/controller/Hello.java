package com.xjtushilei.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilei
 * @Date 2017/6/12.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
