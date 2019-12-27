package com.kk.pattern.memento;

/**
 * 管理者
 * @author kian
 * @date 2019/12/26
 */
public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
