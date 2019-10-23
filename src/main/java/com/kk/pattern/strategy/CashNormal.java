package com.kk.pattern.strategy;

/**
 * @author kian
 * @date 2019/10/21
 * 规则一：原价
 */
public class CashNormal extends CashSuper {
    private Double price;

    public CashNormal(double price) {
        this.price = price;
    }

    @Override
    double acceptCash() {
        System.out.println("原价不搞活动");
        return price;
    }
}
