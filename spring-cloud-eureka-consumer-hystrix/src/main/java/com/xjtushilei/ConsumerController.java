package com.xjtushilei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilei
 * @Date 2017/6/13.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemoteService helloRemoteService;

    @Autowired
    CallDependencyService callDependencyService;

    @RequestMapping("/hello")
    public String hello() {
        return helloRemoteService.hi();
    }


    @RequestMapping("/random")
    public String hi() {
        return callDependencyService.getRandomNumber();
    }
}
