package com.liang.demo4;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 接口注入方式访问ServletAPI
 * @author 梁思禹
 */
public class RequestDemo3 extends ActionSupport implements ServletRequestAware,ServletContextAware {

    private HttpServletRequest request;

    private ServletContext context;

    @Override
    public String execute() throws Exception {

//        通过接口注入方式获得request对象
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String name: parameterMap.keySet()
             ) {
            System.out.println(name+"  "+parameterMap.get(name));
        }

//        向作用域内保存数据
        request.setAttribute("phone", "123srfq");
        request.getSession().setAttribute("sessionName", "1243sdfasf");
        context.setAttribute("applicationName", "rf1se123rfds");

        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }
}
