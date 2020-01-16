package com.kk.pattern.Mediator;

/**
 * @author kian
 * @date 2020/1/10
 */
public class MediatorMain {
    public static void main(String[] args) {
        UNSecurity unSecurity = new UNSecurity();
        USA usa = new USA(unSecurity);
        Iraq iraq = new Iraq(unSecurity);

        usa.declare("我要开打了");
        iraq.declare("来吧");



    }
}
