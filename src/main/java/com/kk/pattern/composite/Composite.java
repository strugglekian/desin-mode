package com.kk.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全方式，客户端在调用add和remove的时候不需要判断
 * @author kian
 * @date 2019/12/26
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        componentList.remove(component);
    }

    @Override
    public void display() {
        for (Component component : componentList) {
            component.display();
        }
    }
}
