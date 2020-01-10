package com.kk.pattern.Mediator;

/**
 * @author kian
 * @date 2020/1/10
 */
public class USA extends Contry {


    public USA(MediatorUN mediatorUN) {
        super(mediatorUN);
    }

    public void declare(String message) {
        mediatorUN.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国收到伊拉克消息：" + message);
    }
}
