package com.kk.pattern.responsibility;

/**
 * @author kian
 * @date 2020/1/10
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handler(int request) {
        if (10 < request && request < 20) {
            System.out.println("222222222");
        } else {
            System.out.println("2职责链模式，转移到下一个");
            successor.handler(request);
        }
    }
}
