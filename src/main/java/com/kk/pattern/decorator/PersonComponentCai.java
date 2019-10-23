package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/23
 * 定义一个具体的对象
 */
public class PersonComponentCai extends PersonComponent {
    private String name;

    public PersonComponentCai() {
    }

    PersonComponentCai(String name) {
        this.name = name;
    }


    @Override
    public void show() {
        System.out.println(name + "，今天穿着");
    }
}
