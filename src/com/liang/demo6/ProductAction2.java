package com.liang.demo6;

import com.liang.po.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * 将数据封装到Map中
 * @author 梁思禹
 */
public class ProductAction2 extends ActionSupport {

    private Map<String, Product> map;

    public Map<String, Product> getMap() {
        return map;
    }

    public void setMap(Map<String, Product> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        for (String key: map.keySet()
             ) {
            System.out.println(key+" "+map.get(key));
        }
        return NONE;
    }
}
