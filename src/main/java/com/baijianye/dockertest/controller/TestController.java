package com.baijianye.dockertest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {


    @GetMapping("/test")
    @ResponseBody
    public Map test() {
        Map map = new HashMap();
        map.put("success",true);
        map.put("data","");
        map.put("message","成功");
        return map;
    }
}
