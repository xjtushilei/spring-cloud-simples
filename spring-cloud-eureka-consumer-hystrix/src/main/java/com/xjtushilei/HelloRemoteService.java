package com.xjtushilei;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shilei
 * @Date 2017/6/13.
 */
@Service
public class HelloRemoteService {

    @Autowired
    HelloRemoteInterface helloRemoteInterface;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hi() {
        return helloRemoteInterface.hi();
    }

    public String fallback() {
        return "随机数小小于8，表示将要熔断！这是熔断器的降级方法。";
    }
}
