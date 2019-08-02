package com.liang.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action类实现方式3：继承ActionSupport类
 * @author 梁思禹
 */
public class Action3 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Action3 test");
        return null;
    }
}
