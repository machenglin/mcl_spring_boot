package com.feiyang.service;

import com.xiaomi.miui.ad.emi.dynamic.datasource.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mcl
 * @version 1, 2019/8/13.
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class ServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }
    @Autowired
    private CustomerService customerService;
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + customerService.findCustomer() + " ,i am from port:" + port;
    }
}
