package com.kk.pattern.factoryMethod;

import com.kk.pattern.simpleFactory.AddOperation;
import com.kk.pattern.simpleFactory.Operation;

/**
 * @author kian
 * @date 2019/10/23
 */
public class AddFactory implements OperationMethodFactory{
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
