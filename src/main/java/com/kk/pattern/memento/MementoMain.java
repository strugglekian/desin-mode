package com.kk.pattern.memento;

/**
 * 备忘录模式：在不破坏封装的前提下，捕获一个对象的内部状态，并在改对象之外保存这个状态。
 * 一般备忘录有两个接口，一个窄接口，返回备忘录的信息；宽接口，可以获取所有的数据。
 * 备忘录模式适用于功能复杂，需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分
 * @author kian
 * @date 2019/12/25
 */
public class MementoMain {
    public static void main(String[] args) {
        //初始化属性
        System.out.println("初始化属性");
        PlayOriginator playOriginator = new PlayOriginator();
        playOriginator.showPlay();


        //保存到管理者里面
        System.out.println("保存属性");
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(playOriginator.saveMemento());
        System.out.println("=============");

        //改变属性
        System.out.println("改变属性");
        playOriginator.change();
        playOriginator.showPlay();

        System.out.println("还原属性");
        playOriginator.recoveryMemento(careTaker.getMemento());
        playOriginator.showPlay();


    }
}
