package com.kk.designmode.simpleFactoryMode;

/**
 * @author kian
 * @date 2019/10/18
 */
public class AddOperation extends Operation {

    @Override
    double getResult(double a, double b) {
        return a + b;
    }

}
