package com.kk.pattern.strategy;

/**
 * @author kian
 * @date 2019/10/21
 * 策略模式，抽象策略类，在不同的时间应用不同的业务规则，就可以考虑策略模式处理这种变化的可能性。
 * 个人理解：把不同的规则算法生成各自的规则类
 */
public abstract class CashSuper {
    abstract double acceptCash();
}
