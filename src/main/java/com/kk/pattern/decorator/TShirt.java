package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 具体装饰类
 */
public class TShirt extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
