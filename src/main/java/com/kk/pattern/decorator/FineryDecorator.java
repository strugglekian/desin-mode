package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 抽象装饰类
 */
public class FineryDecorator extends Person {
    protected Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }


}
