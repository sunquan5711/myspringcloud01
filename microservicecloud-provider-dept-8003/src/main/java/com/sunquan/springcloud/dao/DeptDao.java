/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-10.
 */
package com.sunquan.springcloud.dao;

import com.sunquan.spingcloud.entrty.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 *@author sunquan
 *@create 2019-04-10
 *@Email sunquan@qq.com
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}