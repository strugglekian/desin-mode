package com.kk.pattern.builder;

/**
 * @author kian
 * @date 2019/10/24
 */
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartOne() {
        System.out.println("建造部件G");
        product.add("G");
    }

    @Override
    public void buildPartTwo() {
        System.out.println("建造部件H");
        product.add("H");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
