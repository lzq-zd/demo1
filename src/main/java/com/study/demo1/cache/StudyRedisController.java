package com.study.demo1.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: StudyRedisController
 * @Author: 中都
 * @Date: 2021/8/1 09:46
 * @Description: TODO
 */
@RestController
public class StudyRedisController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/setKey")
    @ResponseBody
    public String setKey(String name, String age) {
        redisUtil.setKey("name", name);
        redisUtil.setKey("age", age);

        return name + " * " + age;
    }


    @RequestMapping("/getKey")
    @ResponseBody
    public String getKey() {
        String retName = redisUtil.getValue("name");
        String retAge = redisUtil.getValue("age");
        return retName + " * " + retAge;
    }
}
