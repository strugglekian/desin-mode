package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/23
 * 定义一个具体的对象
 */
public class PersonCai extends Person {
    private String name;

    public PersonCai() {
    }

    PersonCai(String name) {
        this.name = name;
    }


    @Override
    public void show() {
        System.out.println(name + "，今天穿着");
    }
}
