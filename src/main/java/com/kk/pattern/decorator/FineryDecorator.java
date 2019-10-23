package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 抽象装饰类
 */
public abstract class FineryDecorator extends PersonComponent {
    private PersonComponent person;

    protected void decorator(PersonComponent person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }


}
