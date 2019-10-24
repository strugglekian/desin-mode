package com.kk.pattern.template;

/**
 * @author kian
 * @date 2019/10/24
 */
public abstract class AbstractTemplate {
    public abstract void ask();

    public abstract void answer();

    public void template(){
        System.out.println("题目：");
        ask();
        System.out.println("开始答题");
        answer();
    }
}
