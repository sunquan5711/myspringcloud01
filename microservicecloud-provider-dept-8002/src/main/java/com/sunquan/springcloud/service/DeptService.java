/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-10.
 */
package com.sunquan.springcloud.service;

import com.sunquan.spingcloud.entrty.Dept;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-10
 *@Email sunquan@qq.com
 */
public interface DeptService {

     public boolean add(Dept dept);

     public Dept get(Long id);

     public List<Dept> list();
}