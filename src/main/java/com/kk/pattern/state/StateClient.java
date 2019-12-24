package com.kk.pattern.state;

/**
 * @author kian
 * @date 2019/12/24
 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context(new StateA());
        context.request();
    }
}
