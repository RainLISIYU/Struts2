package com.liang.demo5;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class UserAction1 extends ActionSupport {

    private String name;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(name+" "+password+" "+age+" "+
            birthday+" "+salary);
        return NONE;
    }
}
