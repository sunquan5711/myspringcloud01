/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-03.
 */
package com.sunquan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *@author sunquan
 *@create 2019-04-03
 *@Email 2581557729@qq.com
 */

//extends SpringBootServletInitializercom
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8003_App.class,args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//
//        return builder.sources(DeptProvider8001_App.class);
//    }

}