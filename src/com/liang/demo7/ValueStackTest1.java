package com.liang.demo7;

import com.liang.po.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.util.*;

/**
 * ValueStack内部结构及存入数据
 * @author 梁思禹
 */
public class ValueStackTest1 extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
//        获取ValueStack方式一：通过ActionContext获取
        ValueStack valueStack = ActionContext.getContext().getValueStack();
//        方式二：通过Request获取
        ValueStack attribute = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);

//        输出true
        System.out.println(valueStack == attribute);

        user = new User("李四");

//        通过ValueStack对象压入User对象，User对象在栈顶
        attribute.push(user);
//        存入一个列表
        List<User> list = new ArrayList<>();
        list.add(new User("yisdf"));
        list.add(new User("dsfa"));
        attribute.set("list", list);

//        通过get方法存入ValueStack
        user = new User("张三");
//        向Context中存入数据
        ServletActionContext.getRequest().setAttribute("name", "sdfdsf");
        ServletActionContext.getRequest().getSession().setAttribute("name", "sdfsda");
        ServletActionContext.getServletContext().setAttribute("name", "dsfasf");
        return SUCCESS;

    }
}
