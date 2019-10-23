package com.kk.pattern.simpleFactory;

/**
 * @author kian
 * @date 2019/10/18
 */
public class MinusOperation extends Operation {

    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
