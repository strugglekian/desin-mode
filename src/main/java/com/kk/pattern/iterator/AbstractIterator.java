package com.kk.pattern.iterator;

import java.util.function.Consumer;

/**
 * @author kian
 * @date 2019/12/27
 */

public interface AbstractIterator<E> {

    boolean hasNext();

    E next();

    default void remove(){};

    default void forEachRemaining(Consumer action){};
}
