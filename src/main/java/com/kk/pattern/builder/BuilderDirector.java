package com.kk.pattern.builder;


/**
 * @author kian
 * @date 2019/10/24
 */
public class BuilderDirector {
    private Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }

    public void build(){
        Product product = builder.getProduct();
        System.out.println(product);
        builder.buildPartTwo();
    }

}
