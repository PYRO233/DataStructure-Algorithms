package com.github.pyro233.algorithms.sort.selection;

import com.github.pyro233.algorithms.sort.AbstractSort;

public class SelectionSort extends AbstractSort {

    private SelectionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // 记录最大最小值的指针
            int minIndex = left;
            int maxIndex = right;

            // 在每一轮查找时, 要保证arr[minIndex] <= arr[maxIndex]
            if (arr[minIndex].compareTo(arr[maxIndex]) > 0) {
                swap(arr, minIndex, maxIndex);
            }
            for (int i = left + 1; i < right; i++) {
                if (arr[i].compareTo(arr[minIndex]) < 0) {
                    // 1. 先标记
                    minIndex = i;
                } else if (arr[i].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = i;
                }
            }
            // 2. 再swap，减少swap次数
            swap(arr, left, minIndex);
            swap(arr, right, maxIndex);
            left++;
            right--;
        }
    }

    /**
     * 每次找最小的放到应属的位置
     * 每次寻找[i,n)内的最小值，交换i和最小值
     */
    public static <T extends Comparable<T>> void sortWithMin(T[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}
