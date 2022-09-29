package com.example.studyproject.lambda;

@FunctionalInterface
public interface DividedBy13<T, V> {
    T dividedWithoutRemainder(V v);
}
