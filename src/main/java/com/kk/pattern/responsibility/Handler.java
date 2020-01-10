package com.kk.pattern.responsibility;

/**
 * 职责链模式
 * @author kian
 * @date 2020/1/10
 */
public abstract class Handler {

     protected Handler successor;

     public abstract void handler(int request);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
