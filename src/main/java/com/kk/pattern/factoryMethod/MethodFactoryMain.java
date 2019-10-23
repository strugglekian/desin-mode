package com.kk.pattern.factoryMethod;

import com.kk.pattern.simpleFactory.Operation;

/**
 * @author kian
 * @date 2019/10/23
 * 工厂方法模式
 */
public class MethodFactoryMain {
    public static void main(String[] args) {
        OperationMethodFactory addFactory = new AddFactory();
        Operation operation = addFactory.createOperation();
        System.out.println(operation.getResult(1.2, 3));
    }
}
