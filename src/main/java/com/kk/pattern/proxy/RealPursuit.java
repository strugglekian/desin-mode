package com.kk.pattern.proxy;

/**
 * @author kian
 * @date 2019/10/23
 * 真实的对象
 */
public class RealPursuit extends PursuitSubject {
    @Override
    void giveFlower() {
        System.out.println("追求者的送花");
    }

    @Override
    void giveChocolate() {
        System.out.println("追求者送巧克力");
    }
}
