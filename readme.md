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
## 端口

- config-server : 8888
- config-client : 8082
- eureka-server : 8761，8762
- eureka-client : 8083


## 依赖说明 
- spring-boot-starter-actuator ： 提供监控信息
- spring-boot-starter-web ： web框架
- spring-cloud-starter-config ：config的client端
- spring-cloud-config-server ： config的服务端
- spring-cloud-starter-eureka-server ： eureka的服务端

## 文章链接

> 1. [spring-cloud-config:分布式配置管理](http://www.xjtushilei.com/2017/06/12/spring-cloud-series-spring-cloud-config)
> 2. [spring-cloud-eureka:服务注册与发现](http://www.xjtushilei.com/2017/06/13/spring-cloud-series-spring-cloud-eureka)