package com.kk.pattern.builder;

/**
 * @author kian
 * @date 2019/10/24
 */
public class ConcreteBuilderA extends Builder {

   private Product product =  new Product();

    @Override
    public void buildPartOne() {
        System.out.println("建造部件A");
        product.add("A");
    }

    @Override
    public void buildPartTwo() {
        System.out.println("建造部件B");
        product.add("B");
    }

    @Override
    public Product getProduct() {
        buildPartOne();
        buildPartTwo();
        return product;
    }
}
