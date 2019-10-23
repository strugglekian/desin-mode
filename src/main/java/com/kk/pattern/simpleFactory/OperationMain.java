package com.kk.pattern.simpleFactory;

/**
 * @author kian
 * @date 2019/10/18
 * 简单工厂模式
 */
public class OperationMain {
    public static void main(String[] args) {
        Operation operation = new OperationFactory().createOperation("+");
        double result = operation.getResult(1.1, 2.1);
        System.out.println(result);
    }
}
