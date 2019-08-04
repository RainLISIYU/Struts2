package com.liang.demo7;

import com.liang.po.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

import java.util.Random;

/**
 * 测试OGNL
 * @author 梁思禹
 */
public class OGNLTest {

    @Test
    public void test1() throws OgnlException {
//        获取Context
        OgnlContext ognlContext = new OgnlContext();
//        获取root跟对象
        Object root = ognlContext.getRoot();
//        执行表达式
        Object value = Ognl.getValue("'hello word'.length()", ognlContext, root);
        System.out.println(value);
    }

    /**
     *OGNL调用静态方法
     * @throws OgnlException
     */
    @Test
    public void test2() throws OgnlException {
        /*System.out.println(new Random().nextInt(10));*/
        OgnlContext ognlContext = new OgnlContext();
        Object root = ognlContext.getRoot();
        Object value = Ognl.getValue("@java.lang.Math@random()", ognlContext, root);
        System.out.println(value);
    }

    /**
     * 获取Root和Context中的数据
     */
    @Test
    public void test3() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.setRoot(new User("张三"));
        ognlContext.put("name", "李四");
        Object root = ognlContext.getRoot();
        Object name = Ognl.getValue("name", ognlContext, root);
        Object value = Ognl.getValue("#name", ognlContext, root);
        System.out.println(value+" "+name);
    }

}
