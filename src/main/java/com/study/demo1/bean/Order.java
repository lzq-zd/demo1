package com.study.demo1.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: Order
 * @Author: 中都
 * @Date: 2021/8/1 00:02
 * @Description: TODO
 */
@Data
public class Order {
    private Long orderId;
    private BigDecimal price;
    private Long userId;
    private String status;

}
