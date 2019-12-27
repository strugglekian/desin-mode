package com.kk.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kian
 * @date 2019/12/27
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> aggregateList = new ArrayList<>();

    @Override
    AbstractIterator createIterator() {
        return new ConcreteAbstractIterator(this);
    }


    public int count() {
        return aggregateList.size();
    }

    public Object index(int index) {
        return aggregateList.get(index);
    }


}
