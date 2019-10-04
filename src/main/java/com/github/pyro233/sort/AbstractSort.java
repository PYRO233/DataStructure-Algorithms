package com.github.pyro233.sort;

public abstract class AbstractSort {

    static void swap(Comparable[] arr, int i, int j) {
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
