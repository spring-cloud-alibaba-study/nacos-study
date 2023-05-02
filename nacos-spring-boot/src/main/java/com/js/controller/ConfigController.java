package com.js.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.js.config.TestProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConfigController {
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;
    @Autowired
    private TestProperties testProperties;

    @GetMapping(value = "/get")
    public String get() {
        return JSON.toJSONString(testProperties.toString()) ;
    }
}