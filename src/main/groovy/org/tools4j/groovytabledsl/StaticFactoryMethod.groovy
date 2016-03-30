package org.tools4j.groovytabledsl

import java.lang.reflect.Executable
import java.lang.reflect.Method

/**
 * User: ben
 * Date: 19/02/2016
 * Time: 5:26 PM
 */
class StaticFactoryMethod<T> implements ExecutableConstructionMethod<T>{
    private Method method;

    StaticFactoryMethod(final Method method) {
        this.method = method
    }

    @Override
    T construct(final Object[] args) {
        method.setAccessible(true)
        return (T) method.invoke(null, args)
    }

    @Override
    Executable getExecutable() {
        return method
    }
}
