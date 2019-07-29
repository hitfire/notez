package cn.zz.notez.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("thirdapi")
public class ThirdApiController {

    @RequestMapping("laohuangli")
    public String getJuheLaohuangli(String date) {
        String res = HttpUtil.get("http://v.juhe.cn/laohuangli/d?key=d655985f107d4e9c4b34e2a009bbde2b&date=" + StrUtil.blankToDefault(date, DateUtil.formatDate(new Date())));
        return res;
    }
}
