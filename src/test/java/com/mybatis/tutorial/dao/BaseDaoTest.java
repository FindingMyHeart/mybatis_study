package com.mybatis.tutorial.dao;

import com.mybatis.tutorial.mapper.OrderMapper;
import com.mybatis.tutorial.mapper.UserMapper;
import com.mybatis.tutorial.pojo.Orders;
import com.mybatis.tutorial.pojo.QueryVo;
import com.mybatis.tutorial.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dajuejinxian on 2018/10/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseDaoTest {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void test(){

        User user = sqlSessionTemplate.selectOne("test.findUserById", 1);
        System.out.println(user);
    }

    @Test
    public void testFindUserByUserName(){

        List<User> list = sqlSessionTemplate.selectList("test.findUserByUserName","五");
        System.out.println(list);
    }

    @Test
    public void insertUser(){

        User user = new User();
        user.setUsername("曾志伟");
        user.setBirthday(new Date());
        int ret = sqlSessionTemplate.insert("test.insertUser", user);
        System.out.println(ret);
        System.out.println(user.getId());
    }

    @Test
    public void updateUserById(){

        User user = new User();
        user.setUsername("曾志伟");
        user.setBirthday(new Date());
        user.setId(30);
        user.setSex("女");
        user.setAddress("a");
        sqlSessionTemplate.update("test.updateUserById", null);
        System.out.println(user);
    }

    @Test
    public void deleteUserById(){

        int ret = sqlSessionTemplate.delete("test.deleteUserById", 29);
        System.out.println(ret);
    }

    @Test
    public void testMapper(){

       User user = userMapper.findUserById(37);
        System.out.println(user);
    }

    @Test
    public void testQueryVo(){


        User user = new User();
        user.setUsername("曾志伟");
        QueryVo vo = new QueryVo();
        vo.setUser(user);
        List<User> list = userMapper.findUserByQueryVo(vo);
        System.out.println(list);
    }

    @Test
    public void testCount(){

       Integer count = userMapper.countuser();
        System.out.println(count);
    }

    @Test
    public void testOrderList(){

        List<Orders> list = orderMapper.selectOrdersList();
        System.out.println(list);
    }

    @Test
    public void testIf(){
        User user = new User();
//        user.setId(36);
        user.setSex("男");
//        user.setUsername("曾志伟");
        List<User> list = userMapper. selectUserBySexAndUsername(user);
        System.out.println(list);
    }

//    @Test
//    public void testSelectByQueryVo(){
//
//        QueryVo queryVo = new QueryVo();
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++){
//            list.add(i);
//        }
//
//        queryVo.setIdsList(list);
//        List<User> users = userMapper.selectUserByIds(queryVo);
//        System.out.println(users);
//    }

//    @Test
//    public void testSelectByQueryVo(){
//
////        QueryVo queryVo = new QueryVo();
////
////        List<Integer> list = new ArrayList<>();
////
////        for (int i = 0; i < 100; i++){
////            list.add(i);
////        }
////
////        Integer[] arr = (Integer[]) list.toArray();
//
//        Integer[] arr = new Integer[3];
//        arr[0] = 32;
//        arr[1] = 33;
//        arr[2] = 34;
//
////        queryVo.setIdsList(list);
//        List<User> users = userMapper.selectUserByIds(arr);
//        System.out.println(users);
//    }

//    @Test
//    public void testSelectByQueryVo(){
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++){
//            list.add(i);
//        }
//
//        List<User> users = userMapper.selectUserByIds(list);
//        System.out.println(users);
//    }

//    一对一映射
    @Test
    public void one2OneMapper(){


        List<Orders> list = orderMapper.selectOrders();
        System.out.println(list);
    }

    @Test
    public void one2Many(){

        List<User> list = userMapper.selectUserList();
        System.out.println(list);

    }

}