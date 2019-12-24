package com.kk.pattern.state;

/**
 * @author kian
 * @date 2019/12/24
 */
public class StateB extends State{
    @Override
    void handle() {
        System.out.println("八点半下班拿宵夜！");
    }
}
