package com.kk.designmode.strategyPattern;

/**
 * @author kian
 * @date 2019/10/21
 * 策略二，满300打八折
 */
public class CashDiscount extends CashSuper {
    private double price;
    private double discount;
    private int moneyCount;

    public CashDiscount(double price, double discount, int moneyCount) {
        this.price = price;
        this.discount = discount;
        this.moneyCount = moneyCount;
    }

    @Override
    double acceptCash() {
        if (price >= moneyCount) {
            price = price * discount;
        }
        System.out.println("满300打八折");
        return price;
    }
}
