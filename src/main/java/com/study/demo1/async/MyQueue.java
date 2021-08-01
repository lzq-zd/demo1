package com.study.demo1.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyQueue
 * @Author: 中都
 * @Date: 2021/8/1 09:06
 * @Description: 模拟消息队列
 */
@Component
public class MyQueue {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //下单
    private String placeOrder;

    //完成订单
    private String completeOrder;

    public String getPlaceOrder() {
        return placeOrder;
    }

    //该方法创建线程只负责处理订单
    public void setPlaceOrder(String placeOrder){
        new Thread(()->{
            logger.info("订单处理线程：接到下单请求："+placeOrder);
            try {
                //模拟处理订单
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.completeOrder = placeOrder;
            logger.info("订单处理线程：下单请求处理完毕："+placeOrder);
        }).start();
    }

    public String getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}
