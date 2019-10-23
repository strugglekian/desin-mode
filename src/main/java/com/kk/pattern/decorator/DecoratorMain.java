package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 * 装饰模式有点：把类中的装饰功能从类中搬移去除，这样可以简化原有的类
 *
 */
public class DecoratorMain {

    public static void main(String[] args) {
        PersonComponent person = new PersonComponentCai("小菜");
        System.out.println("装扮一：");
        TShirt tShirt = new TShirt();
        tShirt.decorator(person);
        tShirt.show();

        System.out.println("装扮二：");
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorator(person);
        bigTrouser.decorator(tShirt);
        bigTrouser.show();

    }
}
