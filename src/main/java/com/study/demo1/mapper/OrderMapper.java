package com.study.demo1.mapper;

import com.study.demo1.bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
public interface OrderMapper {
    //插入订单
    @Insert("insert into t_order(price,user_id,status) values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price")BigDecimal price,@Param("userId")Long userId,@Param("status")String status);

    //查询订单
    /*@Select("<script>"+
              "select"+
               " * "+
              "from t_order t"+
              " where t.order_id in"+
               "<foreach collection='orderIds' open='(' separator=',' close=')' item='id'>+" +
              " #{id}"+
               "</foreach>"+
              "</script>")*/
    List<Order> selectOrderByIds(@Param("orderIds") List<Long> orderIds);

    List<Order> selectAll();
}
