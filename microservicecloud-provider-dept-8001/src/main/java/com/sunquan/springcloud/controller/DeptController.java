/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-10.
 */
package com.sunquan.springcloud.controller;

import com.sunquan.spingcloud.entrty.Dept;
import com.sunquan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-10
 *@Email 2581557729@qq.com
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){

        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){

        List<Dept> deptList = deptService.list();

        return deptList;
    }
}