package com.kk.pattern.template;

/**
 * @author kian
 * @date 2019/10/24
 */
public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    public void ask() {
        System.out.println("New Zealand?");
    }

    @Override
    public void answer() {
        System.out.println("i want.");
    }
}
