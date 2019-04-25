/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-24.
 */
package com.sunquan.mqtest;

import com.sunquan.spingcloud.entrty.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-24
 *@Email 2581557729@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudAmqpTest {

    private static final String REST_URL_PREFIX =  "http://MICROSERVICECLOUD-DEPT";


    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void MessageTest(){

        String requestUrl = REST_URL_PREFIX+"/dept/list";

        List<Dept> depts = restTemplate.getForObject(requestUrl, List.class);
        System.out.println("看看能否从微服务获取到值"+depts.size());

        rabbitTemplate.convertAndSend("amq.fanout","amq.fanout",depts);
        System.out.println();
    }
}