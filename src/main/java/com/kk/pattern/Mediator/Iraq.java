package com.kk.pattern.Mediator;

/**
 * @author kian
 * @date 2020/1/10
 */
public class Iraq extends Contry {
    public Iraq(MediatorUN mediatorUN) {
        super(mediatorUN);
    }

    public void declare(String message) {
        mediatorUN.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克收到美国的消息：" + message);
    }
}
