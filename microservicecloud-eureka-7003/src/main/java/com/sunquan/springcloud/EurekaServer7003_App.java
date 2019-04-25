/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-19.
 */
package com.sunquan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 *@author sunquan
 *@create 2019-04-19
 *@Email 2581557729@qq.com
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}