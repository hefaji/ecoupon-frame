package com.xiaobaidu.ecoupon.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by dell on 2017/6/8.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApp extends SpringBootServletInitializer {
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp.class, args);
    }

}
