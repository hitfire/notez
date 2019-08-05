package cn.zz.notez.controller;

import cn.zz.notez.domain.JsonResult;
import cn.zz.notez.domain.data.Person;
import cn.zz.notez.domain.data.User;
import cn.zz.notez.domain.mapper.UserMapper;
import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowItem;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
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

    static {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("hello1");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20.
        rule.setCount(1);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);

        ParamFlowRule rule1 = new ParamFlowRule("hello")
                .setParamIdx(0)
                .setCount(4);
        ParamFlowItem item = new ParamFlowItem().setObject(String.valueOf(2))
                .setClassType(String.class.getName())
                .setCount(2);
        rule1.setParamFlowItemList(Collections.singletonList(item));

        ParamFlowRuleManager.loadRules(Collections.singletonList(rule1));
    }

//    @SentinelResource(value = "hello", blockHandler = "blockHandler")
    @RequestMapping("/hello")
    public JsonResult index(String a, HttpServletRequest request, HttpServletResponse response) {
        //count和Rule中的count有关，比如Rule中设置count=4，下面的count=2，则一次访问用两个token，即2次访问后限制，count=3,4 一次访问后限制，count>4，第一次访问就限制
        try (Entry e = SphU.entry("hello", EntryType.IN, 5, a)) {

        } catch (BlockException e) {
            return blockHandler(null, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        HttpSession session = request.getSession();
        System.out.println(session.getId());

        Person person = new Person();
        System.out.println(person.getA());

//        List<User> userList = userMapper.selectAll();
//        logger.info(JSON.toJSONString(userList));

        Cookie cookie = new Cookie("user","sbacnm");
        response.addCookie(cookie);

        return new JsonResult("正常返回");
    }

    public JsonResult blockHandler(HttpServletRequest request, HttpServletResponse response, BlockException blockException) {
        return new JsonResult("频率限制");
    }
}
