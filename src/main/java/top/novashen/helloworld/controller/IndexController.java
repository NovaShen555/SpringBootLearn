package top.novashen.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "forward:/index.html";
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
