package com.spring.demo.springbootexample.controller;

import com.spring.demo.springbootexample.mapper.BaseAdminPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    BaseAdminPermissionMapper baseAdminPermissionMapper;
    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return baseAdminPermissionMapper.selectByExample(null);
    }
}
