package com.kk.designmode.strategyPattern;

/**
 * @author kian
 * @date 2019/10/21
 */
public class CashContext {
    private CashSuper cashSuper;


    public double getResult(int strategy) {
        switch (strategy) {
            case 1:
                cashSuper = new CashNormal(300);
                break;
            case 2:
                cashSuper = new CashDiscount(500, 0.8, 350);
                break;
            case 3:
                cashSuper = new CashReturn(500, 300, 100);
                break;
            default:
                throw new RuntimeException("");
        }
        return cashSuper.acceptCash();
    }
}
