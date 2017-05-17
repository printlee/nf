package com.wkzf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 注解标注此类为springmvc的controller，url映射为"/home"
 */
@Controller
public class HomeController {

    @RequestMapping("/helloworld")
    public void hello(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("hello world");
        return;
    }
}