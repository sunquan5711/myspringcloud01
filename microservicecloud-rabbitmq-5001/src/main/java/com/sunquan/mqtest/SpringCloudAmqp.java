/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-24.
 */
package com.sunquan.mqtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *@author sunquan
 *@create 2019-04-24
 *@Email 2581557729@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudAmqp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAmqp.class,args);
    }

}