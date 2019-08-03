package com.liang.demo4;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;

/**
 * 完全解耦合方式访问ServletAPI
 * 这种方式只能获得request、sesion、application是数据的Map集合，不能操作这些对象本身的方法
 * @author 梁思禹
 */
public class RequestDemo1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
//        利用ActionContext对象接受参数
        ActionContext actionContext = ActionContext.getContext();
//        调用getParameters()方法，相当于request.getParameterMap()
        HttpParameters parameters = actionContext.getParameters();
        for (String name: parameters.keySet()
             ) {
            System.out.println(name+" "+parameters.get(name));
        }

//        向域中存入数据
//        相当于request.setAttribute()
        actionContext.put("phone", "12312");
//        相当于session.setAttribute()
        actionContext.getSession().put("sessionName", "6356");
//        相当于application.setAttribute()
        actionContext.getApplication().put("applicationName", "44876");

        return SUCCESS;

    }
}
