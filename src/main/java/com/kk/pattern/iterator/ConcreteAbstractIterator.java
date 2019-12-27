package com.kk.pattern.iterator;

import java.util.function.Consumer;

/**
 * @author kian
 * @date 2019/12/27
 */
public class ConcreteAbstractIterator implements AbstractIterator {

    private final ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteAbstractIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        try {
            Object index = aggregate.index(current + 1);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object index = aggregate.index(current);
        current++;
        return index;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
