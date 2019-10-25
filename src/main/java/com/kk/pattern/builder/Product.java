package com.kk.pattern.builder;

import lombok.Data;
import lombok.var;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kian
 * @date 2019/10/24
 */
@Data
public class Product {
    private List product = new ArrayList<String>();

    public void add(String s){
        product.add(s);
    }
}
