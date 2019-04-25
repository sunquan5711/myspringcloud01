package com.sunquan.springcloud.cotroller;


import com.sunquan.spingcloud.entrty.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptController_ConsumerTest {

    private static final String REST_URL_PREFIX =  "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testGetList() {
        String requestUrl = REST_URL_PREFIX+"/dept/list";
        List<Dept> deptList = restTemplate.getForObject(requestUrl, List.class);
        System.out.println("瞅瞅能取到值不："+deptList.size());
    }
}