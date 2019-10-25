package com.kk.pattern.observer;

/**
 * @author kian
 * @date 2019/10/25
 */
public class ConcreteObserverB extends AbstractObserver {


    private Subject subject;
    private String state;

    public ConcreteObserverB(Subject subject, String state) {
        this.subject = subject;
        this.state = state;
    }

    @Override
    public void update() {
        subject.setState(state);
        System.out.println("观察者B的状态：" + subject.getState());
    }
}
