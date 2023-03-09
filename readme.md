# DeviceCenter
设备中心管理系统是以SpringBoot为框架开发的前后端分离单体应用，主要用于演示Iot设备管理和信息收集展示平台。
> 作者: 游兰强
## 开发框架
- springboot3
- mybatis-plus
- redisson

## 项目结构


## 依赖环境
- jdk17
- influxdb2.6.1
- mysql8.0
- redis7.0

### influxdb的docker安装命令
```shell
 docker run -itd -p 8086:8086 \
      -v $PWD/influxdb2/data:/var/lib/influxdb2 \
      -v $PWD/influxdb2/config:/etc/influxdb2 \
      -e DOCKER_INFLUXDB_INIT_MODE=setup \
      -e DOCKER_INFLUXDB_INIT_USERNAME=root \
      -e DOCKER_INFLUXDB_INIT_PASSWORD=520@datacenter \
      -e DOCKER_INFLUXDB_INIT_ORG=device-center \
      -e DOCKER_INFLUXDB_INIT_BUCKET=first-device \
      influxdb:latest
```

### mysql的docker安装命令
```shell
docker run -itd -p 3306:3306 \ 
      --name mysql8 \
      -e MYSQL_ROOT_PASSWORD=root \
      mysql:latest
```
### redis的docker安装命令
```shell
docker run -itd --name redis7 \
      -v $PWD/redis/data:/data \
      -p 6379:6379 \
      redis:latest
```