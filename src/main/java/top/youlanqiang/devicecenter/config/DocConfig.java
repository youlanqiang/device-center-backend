package top.youlanqiang.devicecenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class DocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(
                new Info()
                        .title("DeviceCenter API")
                        .description("设备中心管理系统是以SpringBoot为框架开发的前后端分离单体应用，主要用于演示Iot设备管理和信息收集展示平台。"));
    }
}
