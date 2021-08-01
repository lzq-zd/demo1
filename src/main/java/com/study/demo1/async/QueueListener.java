package com.study.demo1.async;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @ClassName: QueueListener
 * @Author: 中都
 * @Date: 2021/8/1 09:10
 * @Description: 创建消息队列的监听器监听结果
 */
@Component
public class QueueListener implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private MyQueue myQueue;

    @Autowired
    private DeferredResultHolder resultHolder;

    private Logger logger = LoggerFactory.getLogger(getClass());

    //该方法监听处理结果，并将结果填写到DeferredResultHolder中去
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        new Thread(() ->{
            while (true){
                if(StringUtils.isNotBlank(myQueue.getCompleteOrder())){
                    String orderNumber = myQueue.getCompleteOrder();
                    logger.info("监听器线程：返回订单处理结果："+orderNumber);
                    //处理完毕，结果返回
                    resultHolder.getMap().get(orderNumber).setResult("place order success");

                    myQueue.setCompleteOrder(null);
                }else {
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
