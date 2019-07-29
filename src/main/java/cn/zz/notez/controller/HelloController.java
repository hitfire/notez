package cn.zz.notez.controller;

import cn.zz.notez.domain.JsonResult;
import cn.zz.notez.domain.data.User;
import cn.zz.notez.domain.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

/**
 * Hello World
 *
 * @author: zz
 * @date: 2018/10/8 15:13
 */
@RestController
public class HelloController {

    Logger logger = Logger.getLogger("HelloController");

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public JsonResult index(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());

        List<User> userList = userMapper.selectAll();
        logger.info(JSON.toJSONString(userList));

        Cookie cookie = new Cookie("user","sbacnm");
        response.addCookie(cookie);

        return null;
    }
}
