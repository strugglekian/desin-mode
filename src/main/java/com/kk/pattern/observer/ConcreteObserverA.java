package com.kk.pattern.observer;

/**
 * @author kian
 * @date 2019/10/25
 */
public class ConcreteObserverA extends AbstractObserver {

    private Subject subject;
    private String state;

    public ConcreteObserverA(Subject subject, String state) {
        this.subject = subject;
        this.state = state;
    }

    @Override
    public void update() {
        subject.setState(state);
        System.out.println("观察者A的状态：" + subject.getState());
    }
}
