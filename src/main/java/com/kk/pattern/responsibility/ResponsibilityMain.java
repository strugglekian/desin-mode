package com.kk.pattern.responsibility;

/**
 * 职责链可简化对象的相互连接，它们仅需要保持一个指向其后者的引用
 * 注意：到链的末端，必须要处理请求
 * @author kian
 * @date 2020/1/10
 */
public class ResponsibilityMain {
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();
        Handler concreteHandler3 = new ConcreteHandler3();
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);

        concreteHandler1.handler(23);

    }
}
