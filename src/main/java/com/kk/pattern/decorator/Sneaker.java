package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/23
 * 装饰类三
 */
public class Sneaker extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("运动鞋");
        super.show();
    }
}
