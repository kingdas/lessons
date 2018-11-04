package com.chenheping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/4/14 0014.
 */
@Controller
public class StaticController {
    @RequestMapping({"","login"})
    public String login(){
        return "login";
    }
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("/page/*")
    public String suoyou(HttpServletRequest request){
        String URL = request.getRequestURL().toString();
        String url = URL.split("/")[URL.split("/").length-1];
        if (url.equals("index")){
            return url;
        }else{
            return "/page/"+url;
        }
    }
}
