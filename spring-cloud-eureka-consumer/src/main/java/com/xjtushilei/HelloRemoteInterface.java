package com.xjtushilei;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shilei
 * @Date 2017/6/13.
 */
@Component
@FeignClient(name = "eureka-client-1")
public interface HelloRemoteInterface {

    @RequestMapping(value = "/hi")
    public String hi();
}
