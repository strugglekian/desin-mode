package com.kk.pattern.factoryMethod;

import com.kk.pattern.simpleFactory.MinusOperation;
import com.kk.pattern.simpleFactory.Operation;

/**
 * @author kian
 * @date 2019/10/23
 */
public class MinusFactory implements OperationMethodFactory {
    @Override
    public Operation createOperation() {
        return new MinusOperation();
    }
}
