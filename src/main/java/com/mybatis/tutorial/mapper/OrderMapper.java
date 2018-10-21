package com.mybatis.tutorial.mapper;

import com.mybatis.tutorial.pojo.Orders;
import com.mybatis.tutorial.pojo.User;

import java.util.List;

/**
 * Created by dajuejinxian on 2018/10/20.
 */
public interface OrderMapper {

    List<Orders> selectOrdersList();

    List<Orders> selectOrders();

}
