package com.kk.pattern.adapter;

/**
 * 适配器
 * @author kian
 * @date 2019/12/24
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
