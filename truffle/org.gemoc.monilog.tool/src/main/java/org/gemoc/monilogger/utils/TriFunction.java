package org.gemoc.monilogger.utils;

@FunctionalInterface
public interface TriFunction<T,U,V,R> {
	R accept(T t, U u, V v);
}
