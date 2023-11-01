<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">Spring Cloud Practice v1.0.0</h1>
<h4 align="center">基于SpringCloud 2021.0.3和SpringCloud alibaba 2021.0.4的Java快速开发框架</h4>

## 平台简介

* 网关Spring Cloud Gateway
* 服务注册中心Spring Cloud Alibaba Nacos
* 服务配置中心Spring Cloud Alibaba Nacos
* 通信Spring Cloud Openfeign
* 限流Spring Cloud Alibaba Sentinel

## nacos
### nacos安装

### nacos启动
startup.cmd -m standalone

### nacos管理页面
http://localhost:8848/nacos

## Sentinnel
### Sentinel安装

### Sentinel启动
java -Dserver.port=8088 -Dcsp.sentinel.dashboard.server=localhost:8088 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
java -Dserver.port=8088 -jar sentinel-dashboard.jar

### Sentinel访问
http://localhost:8088/#/dashboard/home





