package com.github.pyro233.algorithms.sort.bubble;

import com.github.pyro233.algorithms.sort.AbstractSort;

public class BubbleSort extends AbstractSort {

    private BubbleSort() {
    }

    /**
     * 优化, 每一趟Bubble Sort都将最大的元素放在了最后的位置
     * 所以下一次排序, 最后的元素可以不再考虑
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {

        int n = arr.length;
        // 使用newn进行优化
        int newn;

        do {
            newn = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                    // 记录最后一次的交换位置,在此之后的元素在下一轮扫描中均不考虑
                    newn = i;
                }
            }
            n = newn;
        } while (newn > 0);
    }

    public static <T extends Comparable<T>> void sortWithFull(T[] arr) {

        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
