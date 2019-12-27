package com.kk.pattern.composite;

/**
 * 透明方式：实现了一些不需要的接口
 * @author kian
 * @date 2019/12/26
 */
public class Leaf implements Component {
    @Override
    public void addComponent(Component component) {
        System.out.println("不需要实现");
    }

    @Override
    public void removeComponent(Component component) {
        System.out.println("不需要实现");
    }

    @Override
    public void display() {

    }
}
