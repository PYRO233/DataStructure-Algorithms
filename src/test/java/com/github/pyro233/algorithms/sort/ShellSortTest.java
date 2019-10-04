package com.github.pyro233.algorithms.sort;

import com.github.pyro233.algorithms.sort.shell.ShellSort;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShellSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 4, 3, 2, 1};
        ShellSort.sort(arr);
        assertThat(arr, equalTo(Arrays.asList(1, 2, 3, 4, 5).toArray()));
    }

}
