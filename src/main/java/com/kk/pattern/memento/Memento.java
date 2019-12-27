package com.kk.pattern.memento;

import lombok.Getter;

/**
 * 备忘录存储箱，保存需要的属性值
 *
 * @author kian
 * @date 2019/12/25
 */
@Getter
public class Memento {
    /**
     * 生命值
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;


    public Memento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

}
