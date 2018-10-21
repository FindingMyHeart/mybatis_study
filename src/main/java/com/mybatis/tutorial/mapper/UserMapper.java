package com.mybatis.tutorial.mapper;

import com.mybatis.tutorial.pojo.QueryVo;
import com.mybatis.tutorial.pojo.User;

import java.util.List;

/**
 * Created by dajuejinxian on 2018/10/20.
 */
public interface UserMapper {

    User findUserById(Integer id);

    List<User> findUserByQueryVo(QueryVo queryVo);

    Integer countuser();

    List<User> selectUserBySexAndUsername(User user);

    List<User> selectUserList();

//    List<User> selectUserByIds(Integer[] ids);
//
//    List<User> selectUserByIds(List<Integer> ids);

//    List<User> selectUserByIds(QueryVo vo);
}
