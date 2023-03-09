package top.youlanqiang.devicecenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.youlanqiang.devicecenter.mapper")
public class DeviceCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceCenterApplication.class, args);
    }

}
