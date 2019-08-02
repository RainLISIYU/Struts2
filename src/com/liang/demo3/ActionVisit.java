package com.liang.demo3;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action的访问
 * @author 梁思禹
 */
public class ActionVisit extends ActionSupport {

    public String find(){
        System.out.println("查找成功");
        return NONE;
    }

    public String delete(){
        System.out.println("删除成功");
        return NONE;
    }

    public String update(){
        System.out.println("修改成功");
        return NONE;
    }

    public String save(){
        System.out.println("保存成功");
        return NONE;
    }

}
