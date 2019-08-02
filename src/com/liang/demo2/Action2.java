package com.liang.demo2;


import com.opensymphony.xwork2.Action;

/**
 * Action实现方式2：引用Action接口
 * 接口中的五个常量：SUCCESS 成功 ERROR 失败 LOGIN 登陆出错页面跳转
 *                   INPUT 表单校验出错跳转 NONE 不跳转
 * @author 梁思禹
 */
public class Action2 implements Action{

    @Override
    public String execute(){
        System.out.println("Action2 test");
        return NONE;
    }

}
