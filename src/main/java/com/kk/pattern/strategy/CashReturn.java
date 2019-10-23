package com.kk.pattern.strategy;

/**
 * @author kian
 * @date 2019/10/21
 * 策略三：满300返现80
 */
public class CashReturn extends CashSuper {

    private double moneyCount;
    private double price;
    private double returnMoney;

    public CashReturn(double moneyCount, double price, double returnMoney) {
        this.moneyCount = moneyCount;
        this.price = price;
        this.returnMoney = returnMoney;
    }

    @Override
    double acceptCash() {
        if (price >= moneyCount) {
            price = price - returnMoney;
        }
        return price;
    }
}
