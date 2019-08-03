package com.liang.demo5;

import com.liang.po.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据封装方式二：在页面中提供表达式
 * @author 梁思禹
 */
public class UserAction2 extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }
}
