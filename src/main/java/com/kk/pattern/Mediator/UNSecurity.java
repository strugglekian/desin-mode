package com.kk.pattern.Mediator;

/**
 * @author kian
 * @date 2020/1/10
 */
public class UNSecurity extends MediatorUN {
    @Override
    public void declare(String message, Contry contry) {
        if (contry instanceof USA) {
            System.out.println("联合国代理美国发言：" + message);
        } else if (contry instanceof Iraq) {
            System.out.println("伊拉克发言---战争带来苦难:" + message);
        }
    }
}
