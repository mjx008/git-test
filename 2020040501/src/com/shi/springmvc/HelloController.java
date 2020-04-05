package com.shi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @RequestMapping(value = "/sayHi",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String hello(@RequestParam("heello") String hello){
        System.out.println("进入该方法1234");
        return "success";
    }
}
