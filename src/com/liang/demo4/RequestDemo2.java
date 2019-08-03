package com.liang.demo4;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class RequestDemo2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
//        直接获得request对象，通过ServletActionContext对象
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String name: parameterMap.keySet()
             ) {
            System.out.println(name+" "+parameterMap.get(name));
        }
//        域对象中保存数据
        request.setAttribute("phone", "123213");
        request.getSession().setAttribute("sessionName", "sefaawe");
//        向application中保存数据
        ServletActionContext.getServletContext().setAttribute("applicationName", "dsaf23");
        return SUCCESS;
    }
}
