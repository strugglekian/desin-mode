package com.kk.pattern.state;

/**
 * @author kian
 * @date 2019/12/24
 */
public class StateC extends State{
    @Override
    void handle() {
        System.out.println("九点下班，报销打车！");
    }
}
