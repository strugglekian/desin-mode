package com.kk.pattern.proxy;

/**
 * @author kian
 * @date 2019/10/23
 * 代理对象
 */
public class Proxy extends PursuitSubject {

    private RealPursuit realPursuit;


    public Proxy() {
        realPursuit = new RealPursuit();
    }

    @Override
    void giveFlower() {
        System.out.println("代理者：");
        realPursuit.giveFlower();
    }

    @Override
    void giveChocolate() {
        System.out.println("代理者：");
        realPursuit.giveChocolate();
    }
}
