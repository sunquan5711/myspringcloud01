/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-10.
 */
package com.sunquan.springcloud.service.impl;

import com.sunquan.spingcloud.entrty.Dept;
import com.sunquan.springcloud.dao.DeptDao;
import com.sunquan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-10
 *@Email 2581557729@qq.com
 */
@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}