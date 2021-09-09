package com.js.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "my.test")
@NacosConfigurationProperties(prefix = "my.test", dataId = "nacos-spring-boot",
        type = ConfigType.YAML, autoRefreshed = true)
public class TestProperties {

    private String appId;

    private String userName;

    private String password;

}
