package com.study.demo1;

import com.study.demo1.bean.User;
import com.study.demo1.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserDaoTest
 * @Author: 中都
 * @Date: 2021/8/1 16:53
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Demo1Application.class})
public class UserDaoTest {
    @Autowired
    private UserMapper userMapper;

    //@Test
    public void testInsertUser() {
        for (int i = 1; i < 20; i++) {
            long id = i+1;
            userMapper.insertUser(id,"lzq"+id);
        }
    }

    @Test
    public void testSelectByIds() {
        ArrayList<Long> list = new ArrayList<>();
        list.add(2L);
        list.add(5L);
        List<User> users = userMapper.selectByIds(list);
        System.out.println(users);
    }
}
