package com.gerry.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gerry.dubbo.demo.entity.User;
import com.gerry.dubbo.demo.service.UserService;
import org.junit.Test;

public class UserTests extends UserProviderApplicationTests{

    @Reference(timeout=5000,check=false)
    private UserService userService;

    @Test
    public void testAddUser() throws Exception{
        User user = new User();
        user.setId(10000L);
        user.setName("Gerry");
        String s = userService.addUser(user);
        System.out.println(s);
    }
}
