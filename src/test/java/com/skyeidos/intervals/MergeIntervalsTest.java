package com.skyeidos.intervals;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {

    @Test
    public void testMergeIntervals() {
        int[][] cases = new int[][]{{1, 3}, {2, 4}};
        Assert.assertArrayEquals(new int[][]{{1, 4}}, MergeIntervals.mergeIntervals(cases));
        cases = new int[][]{{1, 4}, {2, 3}};
        Assert.assertArrayEquals(new int[][]{{1, 4}}, MergeIntervals.mergeIntervals(cases));
        cases = new int[][]{};
        Assert.assertArrayEquals(new int[][]{}, MergeIntervals.mergeIntervals(cases));
        cases = new int[][]{{1, 3}, {2, 4}, {7, 8}, {8, 9}};
        Assert.assertArrayEquals(new int[][]{{1, 4}, {7, 9}}, MergeIntervals.mergeIntervals(cases));
        cases = new int[][]{{1, 3}, {2, 4}, {7, 8}, {11, 15}, {8, 9}};
        Assert.assertArrayEquals(new int[][]{{1, 4}, {7, 9}, {11, 15}}, MergeIntervals.mergeIntervals(cases));
    }

}