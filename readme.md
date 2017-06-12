# spring cloud 学习记录

## 提示

- pom使用模块开发，在该目录的pom里配置了项目的顶级parent。
- 运行请先运行server再运行其他

## 端口

- hello-world : 8081
- config-server:8888
- config-client:8082

## 依赖说明 
- spring-boot-starter-actuator ： 提供监控信息
- spring-boot-starter-web ： web框架
- spring-cloud-starter-config ：config的client端
- spring-cloud-config-server ： config的服务端