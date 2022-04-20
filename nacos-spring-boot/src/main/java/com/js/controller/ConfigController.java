package com.js.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.js.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
//    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
//    private boolean useLocalCache;
    @Autowired
    private TestProperties testProperties;

    @GetMapping(value = "/get")
    public String get() {
        return testProperties.toString() + "：";
    }
}