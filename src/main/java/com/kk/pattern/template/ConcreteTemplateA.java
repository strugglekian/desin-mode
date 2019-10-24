package com.kk.pattern.template;

/**
 * @author kian
 * @date 2019/10/24
 */
public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    public void ask() {
        System.out.println("are you lost?");
    }

    @Override
    public void answer() {
        System.out.println("yes");
    }
}
