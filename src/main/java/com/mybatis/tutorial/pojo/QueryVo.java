package com.mybatis.tutorial.pojo;

import java.util.List;

/**
 * Created by dajuejinxian on 2018/10/20.
 */
public class QueryVo {

    private User user;

    List<Integer> idsList;

    Integer[] ids;

    public List<Integer> getIdsList() {
        return idsList;
    }

    public void setIdsList(List<Integer> idsList) {
        this.idsList = idsList;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
