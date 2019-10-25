package com.kk.pattern.observer;

/**
 * @author kian
 * @date 2019/10/25
 * 观察者模式：观察者模式定义了一种一对多的依赖关系，让多个观察者同时监听某一个主题对象。这个主题对象发生变化时，
 * 会通知所有观察者对象，使他们自动更新自己。观察者模式也称为发布订阅模式。
 */
public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserverA concreteObserverA = new ConcreteObserverA(subject, "上线");
        ConcreteObserverB concreteObserverB = new ConcreteObserverB(subject, "下线");

        subject.attach(concreteObserverA);
        subject.attach(concreteObserverB);

        subject.notifyObserver();


    }

}
