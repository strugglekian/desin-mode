package com.kk.pattern.factoryMethod;

import com.kk.pattern.simpleFactory.Operation;

/**
 * @author kian
 * @date 2019/10/23
 * 工厂方法模式相比于简单工厂模式，符合开闭原则，修改关闭，扩展开放
 */
public interface OperationMethodFactory {
    Operation createOperation();
}
