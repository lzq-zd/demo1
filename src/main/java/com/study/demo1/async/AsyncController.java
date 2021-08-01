package com.study.demo1.async;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * @ClassName: AsyncController
 * @Author: 中都
 * @Date: 2021/8/1 09:13
 * @Description: TODO
 */
@RestController
public class AsyncController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MyQueue myQueue;

    @Autowired
    private DeferredResultHolder resultHolder;

    @RequestMapping("/order")
    public DeferredResult<String> order() throws Exception {
        logger.info("主线程进入");
        String orderNum = RandomStringUtils.randomNumeric(8);
        myQueue.setPlaceOrder(orderNum);

        DeferredResult<String> deferredResult = new DeferredResult<>();
        resultHolder.getMap().put(orderNum, deferredResult);
        logger.info("主线程返回");
        return deferredResult;
        /*Callable<String> result = ()->
        {
                logger.info("副线程开始");
                Thread.sleep(1000);//模拟下单业务逻辑耗时
                logger.info("副线程返回");
                return "success";
        };
        logger.info("主线程返回");
        return result;*/
    }
}
