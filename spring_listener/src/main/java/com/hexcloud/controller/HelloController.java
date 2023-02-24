package com.hexcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.hexcloud.service.HelloService;

/**
 * @BeLongsProject:SSM
 * @BelongsPackage:controller
 * @Author:jiangdan
 * @createTime:2023-02-20 15:26:05
 * @Description:TODO
 * @Version:1.0
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
}
