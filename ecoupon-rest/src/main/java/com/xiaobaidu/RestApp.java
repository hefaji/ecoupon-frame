package com.xiaobaidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by dell on 2017/6/4.
 */
@EnableEurekaClient
@SpringBootApplication
public class RestApp {
    public static void main(String[] args) {
        SpringApplication.run(RestApp.class,args);
    }

}
