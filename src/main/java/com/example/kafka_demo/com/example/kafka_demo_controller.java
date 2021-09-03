package com.example.kafka_demo.com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyi
 * @date 2021/9/3
 */
@RestController
public class kafka_demo_controller {
    @RequestMapping("/test")
    public void test(){
        System.out.println("innnnn");
        System.out.println("热部署？");
        System.out.println("boyibo");
        System.out.println("bo2");
    }
}
