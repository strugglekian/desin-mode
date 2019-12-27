package com.kk.pattern.composite;

/**
 *
 * @author kian
 * @date 2019/12/26
 */
public interface Component {

    public void addComponent(Component component);

    public void removeComponent(Component component);

    public void display();
}
