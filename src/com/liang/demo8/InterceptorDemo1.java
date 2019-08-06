package com.liang.demo8;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器
 * @author 梁思禹
 */
public class InterceptorDemo1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("拦截器1执行了");
        String invoke = invocation.invoke();
        System.out.println("拦截器1结束了");
        return invoke;
    }
}
