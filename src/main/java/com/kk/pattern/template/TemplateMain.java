package com.kk.pattern.template;

/**
 * @author kian
 * @date 2019/10/24
 * 模板模式：把不变的行为搬移到超类，去除子类中重复的代码。
 */
public class TemplateMain {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplateA = new ConcreteTemplateA();
        abstractTemplateA.template();

        AbstractTemplate abstractTemplateB = new ConcreteTemplateB();
        abstractTemplateB.template();
    }
}
