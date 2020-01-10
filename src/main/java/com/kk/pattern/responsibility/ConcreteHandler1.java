package com.kk.pattern.responsibility;

/**
 * @author kian
 * @date 2020/1/10
 */
public class ConcreteHandler1 extends Handler {


    @Override
    public void handler(int request) {
        if(request<10){
            System.out.println("111111111");
        }else{
            System.out.println("1职责链模式，转移到下一个");
            successor.handler(request);
        }

    }


}
