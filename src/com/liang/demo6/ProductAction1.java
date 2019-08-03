package com.liang.demo6;

import com.liang.po.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

/**
 * 复杂类型数据的封装
 * @author 梁思禹
 */
public class ProductAction1 extends ActionSupport {
    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String execute() throws Exception {
        for (Product product: products
             ) {
            System.out.println(product);
        }
        return NONE;
    }
}
