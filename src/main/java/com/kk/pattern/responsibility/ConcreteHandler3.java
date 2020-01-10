package com.kk.pattern.responsibility;

/**
 * @author kian
 * @date 2020/1/10
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handler(int request) {
        if (20 < request && request < 30) {
            System.out.println("3333333333");
        } else {
            System.out.println("3职责链模式，转移到下一个");
            successor.handler(request);
        }
    }
}
