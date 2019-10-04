package com.github.pyro233.algorithms.sort;

import com.github.pyro233.algorithms.sort.insertion.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class InsertionSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 4, 3, 2, 1};
        InsertionSort.sort(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

    @Test
    public void testSortUseSwap() {
        Integer[] arr = {5, 4, 3, 2, 1};
        InsertionSort.sortWithSwap(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

}
