package com.github.pyro233.algorithms.sort;

import com.github.pyro233.algorithms.sort.bubble.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 4, 3, 2, 1};
        BubbleSort.sort(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

    @Test
    public void testSortWithFull() {
        Integer[] arr = {5, 4, 3, 2, 1};
        BubbleSort.sortWithFull(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

}
