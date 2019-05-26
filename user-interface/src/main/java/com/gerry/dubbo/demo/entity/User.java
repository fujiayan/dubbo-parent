package com.gerry.dubbo.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/5/26.
 */
@Data
public class User implements Serializable{

    private Long id;
    private String name;
}
