package cn.zz.notez.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * home
 *
 * @author: zz
 * @date: 2020/7/2 16:54
 */
@RestController
@RequestMapping("api/home")
@Slf4j
public class HomeController {

    @Value("${notez.name}")
    private String projectName;

    @Value("${notez.version}")
    private String projectVersion;

    @Value("${notez.author}")
    private String projectAuthor;

    @RequestMapping("index")
    public String index() {
        log.info("api/home/index");
        return "projectName: " + projectName + "<br/>projectVersion: " + projectVersion + "<br/>projectAuthor: " + projectAuthor;
    }

    @RequestMapping(value = "json", produces = "application/json")
    public String json() {
        log.info("api/home/json");
        return "{\"key\":1, \"value\":\"测试\"}";
    }
}
