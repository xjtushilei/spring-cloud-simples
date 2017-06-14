# spring cloud 学习

## 提示

- pom使用模块开发，在该目录的pom里配置了项目的顶级parent。
- 运行请先运行server再运行其他
- 所有的模块基本上都加了eureka-client
- 运行eureka的高可用形式，要以不同的profile来运行。或者在IDEA里不同的方式启动
    ```
    java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer1  
    java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer2
    ```
- 由于我偷懒，针对初学者好像不够友好，没有创建更多的工程，每一个模块下已经有好多配置文件，如果你感到晕，没关系，你还是初学者，慢慢学习。学会的应该很明白的看懂，因为这样启动更方便。

## 端口

- config-server : 8888,8887,8886
- config-client : 8082,8087
- eureka-server : 8761，8762
- eureka-client : 8083,8084,8085 （构建负载均衡集群）
- eureka-consumer : 8086 （用来消费 eureka-client 提供的服务）
- eureka-consumer-hystrix : 8086 
- zuul - 8088



## 文章链接

> 1. [spring-cloud-config: 分布式配置管理](http://www.xjtushilei.com/2017/06/12/spring-cloud-series-spring-cloud-config)
> 2. [spring-cloud-eureka: 服务注册与发现](http://www.xjtushilei.com/2017/06/13/spring-cloud-series-spring-cloud-eureka)
> 3. [spring-cloud-eureka-consumer: 远程服务调用和及其负载均衡](http://www.xjtushilei.com/2017/06/13/spring-cloud-series-spring-cloud-eureka-consumer)
> 4. [spring-cloud-Hystrix: 熔断器保证服务高可用](http://www.xjtushilei.com/2017/06/13/spring-cloud-series-spring-cloud-Hystrix)
> 5. [spring-cloud-config-eureka-ribbon: 分布式配置管理的高可用](http://www.xjtushilei.com/2017/06/13/spring-cloud-series-spring-cloud-config-eureka)
> 6. [spring-cloud-bus: 配置信息的实时更新](http://www.xjtushilei.com/2017/06/14/spring-cloud-series-spring-cloud-bus)
> 7. [spring-cloud-zuul: 网关基础服务](http://www.xjtushilei.com/2017/06/14/spring-cloud-series-spring-cloud-zuul)