package com.kk.pattern.memento;

/**
 * 需要保存数据的发起人，这里是模拟一个游戏角色
 * 假设初始值都是100
 *
 * @author kian
 * @date 2019/12/25
 */
public class PlayOriginator {

    /**
     * 生命值
     */
    private int vit = 100;
    /**
     * 攻击力
     */
    private int atk = 100;
    /**
     * 防御力
     */
    private int def = 100;

    /**
     * 魔法伤害
     */
    private int magic = 100;
    /**
     * 魔法防御
     */
    private int magicDef = 100;

    /**
     * 这里需要保存三个属性
     *
     * @param vit
     * @param atk
     * @param def
     * @return
     */
    public void recoveryMemento(Memento memento) {
        this.atk = memento.getAtk();
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    public Memento saveMemento() {
        return new Memento(this.vit, this.atk, this.def);
    }

    public void showPlay() {
        System.out.printf("vit:[%s],atk:[%s],def:[%s]", vit, atk, def);
        System.out.println();
    }

    public void change() {
        this.vit -= 30;
        this.atk -= 30;
        this.def -= 30;
    }

    @Override
    public String toString() {
        return "PlayOriginator{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                ", magic=" + magic +
                ", magicDef=" + magicDef +
                '}';
    }
}
