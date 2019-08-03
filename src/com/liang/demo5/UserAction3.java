package com.liang.demo5;

import com.liang.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 数据封装方式三：采用模型驱动
 * @author 梁思禹
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User> {
//    模型驱动使用的对象
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }
}
