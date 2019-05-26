package com.gerry.dubbo.demo.userprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gerry.dubbo.demo.entity.User;
import com.gerry.dubbo.demo.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/5/26.
 */
@Component
@Service(retries = 1,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        return "用户编号:"+user.getId()+",用户名称:"+user.getName();
    }
}
