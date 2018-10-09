package cn.zz.notez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * TODO
 *
 * @author: zz
 * @date: 2018/10/8 15:13
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println(new Date() + "=========Hello World!");
        return "Hello World";
    }
}
