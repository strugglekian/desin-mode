package com.kk.designmode.simpleFactoryMode;

/**
 * @author kian
 * @date 2019/10/18
 */
public class OperationFactory {

    public Operation createOperation(String symbol) {

        switch (symbol) {
            case "+":
                return new AddOperation();
            case "-":
                return new MinusOperation();
            default:
                throw new RuntimeException("no operation");

        }

    }


}
