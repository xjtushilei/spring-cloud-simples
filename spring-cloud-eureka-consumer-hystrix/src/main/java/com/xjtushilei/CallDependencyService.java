package com.xjtushilei;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author shilei
 * @Date 2017/6/13.
 */
@Service
public class CallDependencyService {

    private Random random = new Random();

    /**
     * 模拟获取用户信息，并模拟调用失败！
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String getRandomNumber() {
        int randomInt = random.nextInt(10);
        if (randomInt < 8) {  //模拟调用失败情况
            throw new RuntimeException("调用服务失败！");
        } else {
            return "调用服务成功！随机数是:" + randomInt;
        }
    }

    public String fallback() {
        return "随机数小小于8，表示将要熔断！这是熔断器的降级方法。";
    }
}