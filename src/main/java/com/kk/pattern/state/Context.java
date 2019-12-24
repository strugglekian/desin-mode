package com.kk.pattern.state;

/**
 * mqtt 根据不同的topic进行路由分发，就可以使用状态模式
 * 或者有一个枚举类，根据不同的枚举进行编码。减少if...else...的使用
 * @author kian
 * @date 2019/12/24
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
