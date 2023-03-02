# 安装
- influxdb2.6.1
- mysql8.0
- redis7.0

# influxdb的docker安装命令
```shell
 docker run -d -p 8086:8086 \
      -v $PWD/influxdb2/data:/var/lib/influxdb2 \
      -v $PWD/influxdb2/config:/etc/influxdb2 \
      -e DOCKER_INFLUXDB_INIT_MODE=setup \
      -e DOCKER_INFLUXDB_INIT_USERNAME=root \
      -e DOCKER_INFLUXDB_INIT_PASSWORD=520@datacenter \
      -e DOCKER_INFLUXDB_INIT_ORG=device-center \
      -e DOCKER_INFLUXDB_INIT_BUCKET=first-device \
      influxdb:2.0
```
