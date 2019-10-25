package com.kk.pattern.builder;

/**
 * @author kian
 * @date 2019/10/24
 * 建造者模式:抽象建造者，需要例举所有需要建造的接口
 */
public abstract class Builder {

    public abstract void buildPartOne();

    public abstract void buildPartTwo();

    public abstract Product getProduct();
}
