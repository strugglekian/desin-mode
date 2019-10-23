package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 具体装饰类二
 */
public class BigTrouser extends FineryDecorator{

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
