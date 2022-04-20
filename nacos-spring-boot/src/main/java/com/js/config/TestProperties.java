package com.js.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = TestProperties.TEST_PRO_KEY)
@NacosConfigurationProperties(prefix = TestProperties.TEST_PRO_KEY, dataId = "nacos-spring-boot",
        type = ConfigType.YAML, autoRefreshed = true,groupId = "operation")
public class TestProperties {

    public static final String TEST_PRO_KEY = "my.test";
    private String appId;

    private String userName;

    private String password;

}
