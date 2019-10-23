package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 装饰器模式，抽象类
 */
public  class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"，今天穿着");
    }
}
