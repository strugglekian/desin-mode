package com.kk.pattern.strategy;

/**
 * @author kian
 * @date 2019/10/21
 */
public class CashMain {
    public static void main(String[] args) {
        double payMoney = new CashContext().getResult(1);
        System.out.println(payMoney);
    }
}
