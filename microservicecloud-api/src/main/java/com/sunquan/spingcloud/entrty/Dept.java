/**
 * Copyright (c) 2019 LightFish Inc
 * Created by sunquan on 2019-04-01.
 */
package com.sunquan.spingcloud.entrty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 *@author sunquan
 *@create 2019-04-01
 *@Email 2581557729@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -3499131228806520480L;

    private long deptNo;

    private String dname;

    private String db_source;//来自哪个数据库，因为是分表分库的



}