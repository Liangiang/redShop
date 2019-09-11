package com.lxshop.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lx
 * @Description //TODO 默认降级处理
 * @Date 14:49 2019/9/9
 * @Param
 * @return
 **/
@RestController
public class DefaultHystrixController {

    @RequestMapping("/defaultfallback")
    public Map<String, String> defaultfallback() {
        System.out.println("降级操作...");
        Map<String, String> map = new HashMap<>();
        map.put("resultCode", "fail");
        map.put("resultMessage", "服务异常");
        map.put("resultObj", "null");
        return map;
    }
}