/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-19.
 */
package com.sunquan.springcloud.cotroller;

import com.sunquan.spingcloud.entrty.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-19
 *@Email 2581557729@qq.com
 */
@RestController
public class DeptController_Consumer {

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){

        String requestUrl = REST_URL_PREFIX+"/dept/add";

        return restTemplate.postForObject(requestUrl,dept,Boolean.class);

    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){

        String requestUrl = REST_URL_PREFIX+"/dept/get/"+id;

        return restTemplate.getForObject(requestUrl,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> getList(){

        String requestUrl = REST_URL_PREFIX+"/dept/list";
        return restTemplate.getForObject(requestUrl,List.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX =  "http://MICROSERVICECLOUD-DEPT";
}