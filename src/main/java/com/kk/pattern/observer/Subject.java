package com.kk.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kian
 * @date 2019/10/25
 * 通知者
 */
public class Subject {

    private String state;
    private List<AbstractObserver> observerList = new ArrayList<>();

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(AbstractObserver observer) {
        observerList.remove(observer);
    }

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(AbstractObserver observer) {
        observerList.add(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver(){
        for (AbstractObserver abstractObserver : observerList) {
            abstractObserver.update();
        }
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
