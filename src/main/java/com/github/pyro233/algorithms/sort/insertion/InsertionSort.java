package com.github.pyro233.algorithms.sort.insertion;

import com.github.pyro233.algorithms.sort.AbstractSort;

public class InsertionSort extends AbstractSort {

    private InsertionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            T e = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--) {
                // 自身赋上前一位的值，迭代这一操作，等于全部后移一位
                // 已经遍历过的都是有序的，只要插入到合适位置就行了，但是数组的插入是需要后移腾出位置的，swap其实有多余操作
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static <T extends Comparable<T>> void sortWithSwap(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找元素arr[i]合适的插入位置
            // 已经遍历过的都是有序的，只要插入到合适位置就行了
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

}
