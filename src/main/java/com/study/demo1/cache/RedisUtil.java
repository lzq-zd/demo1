package com.study.demo1.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: RedisUtil
 * @Author: 中都
 * @Date: 2021/8/1 09:41
 * @Description: Redis工具类
 */
@Repository
public class RedisUtil {
    @Autowired
    private StringRedisTemplate redisTemplate;

    //存入键值对
    public void setKey(String key,String value) {
        ValueOperations<String,String> operations = redisTemplate.opsForValue();
        operations.set(key,value,10, TimeUnit.SECONDS);
    }

    //取出键值对
    public String getValue(String key) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return ops.get(key);
    }
}
