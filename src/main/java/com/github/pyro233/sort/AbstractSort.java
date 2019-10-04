package com.github.pyro233.sort;

public abstract class AbstractSort {

    static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
