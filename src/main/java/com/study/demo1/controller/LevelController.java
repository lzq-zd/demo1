package com.study.demo1.controller;

import com.study.demo1.bean.Order;
import com.study.demo1.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LevelController
 * @Author: 中都
 * @Date: 2021/8/1 10:02
 * @Description: 水平分表
 */
@RequestMapping("/level")
@RestController
public class LevelController {
    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        for (int i = 1; i < 20; i++) {
            orderMapper.insertOrder(new BigDecimal(i),1L,"success");
        }
        return true;
    }

    @RequestMapping("/selectByIds")
    @ResponseBody
    public List<Order> selectByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(628369459580502016L);
        ids.add(628368506596884481L);
        List<Order> maps = orderMapper.selectOrderByIds(ids);
        System.out.println(maps);
        return maps;
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

}
