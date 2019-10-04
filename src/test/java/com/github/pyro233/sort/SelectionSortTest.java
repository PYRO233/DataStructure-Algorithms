package com.github.pyro233.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SelectionSortTest {

    @Test
    public void testSortUseMin() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SelectionSort.sortUseMin(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

    @Test
    public void testSort() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

}
