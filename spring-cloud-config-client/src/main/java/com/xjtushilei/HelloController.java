package com.xjtushilei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilei
 * @Date 2017/6/12.
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi() {
        return foo;
    }
}
