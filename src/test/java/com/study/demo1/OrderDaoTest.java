package com.study.demo1;

import com.study.demo1.bean.Order;
import com.study.demo1.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OrderDaoTest
 * @Author: 中都
 * @Date: 2021/7/31 22:32
 * @Description: 水平分表测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Demo1Application.class})
public class OrderDaoTest {
    @Autowired
    OrderMapper orderMapper;

    //@Test
    public void testInsertOrder() {
        for (int i = 1; i < 20; i++) {
            orderMapper.insertOrder(new BigDecimal(i),4L,"success");
        }
    }

    //@Test
    public void testSelectOrderByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(628369459580502016L);
        ids.add(628368506596884481L);
        List<Order> maps = orderMapper.selectOrderByIds(ids);
        if(maps.isEmpty()) {
            System.out.println("没有数据");
            return;
        }
        System.out.println(maps);
    }

    @Test
    public void testSelectAll() {
        System.out.println(orderMapper.selectAll().size());
    }
}
