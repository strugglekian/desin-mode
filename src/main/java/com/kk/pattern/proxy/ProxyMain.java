package com.kk.pattern.proxy;

/**
 * @author kian
 * @date 2019/10/23
 * 代理模式的应用：1.远程代理2.虚拟代理3.安全代理4.智能指引 （不好理解。。。）
 */
public class ProxyMain {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.giveChocolate();
        proxy.giveChocolate();
    }
}
