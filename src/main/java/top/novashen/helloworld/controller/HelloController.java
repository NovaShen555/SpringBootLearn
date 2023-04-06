package top.novashen.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String t1(){
        return "Hello World! \n SYH LOVE HLT!";
    }
}
