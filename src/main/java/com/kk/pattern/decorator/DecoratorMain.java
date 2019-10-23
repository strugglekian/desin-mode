package com.kk.pattern.decorator;

/**
 * @author kian
 * @date 2019/10/22
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Person person = new PersonCai("小菜");
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
