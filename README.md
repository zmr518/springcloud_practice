## 组件集成
网关|Spring Cloud Gateway
服务注册中心|Spring Cloud Alibaba Nacos
服务配置中心|Spring Cloud Alibaba Nacos
通信|Spring Cloud Openfeign
限流|Spring Cloud Alibaba Sentinel
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

