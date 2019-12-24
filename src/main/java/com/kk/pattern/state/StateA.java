package com.kk.pattern.state;

/**
 * @author kian
 * @date 2019/12/24
 */
public class StateA extends State {
    @Override
    void handle() {
        System.out.println("6点下班了，很幸福！");
    }
}
