package com.skyeidos.intervals;

import java.util.*;

public class MergeIntervals {

    public static int[][] mergeIntervals(int[][] intervals) {
        Queue<int[]> queue = new PriorityQueue<>(Math.max(1, intervals.length), Comparator.comparingInt(o -> o[0]));
        for (int[] interval : intervals) {
            queue.offer(interval);
        }
        int[] x = queue.poll();
        int[] y;
        List<int[]> result = new ArrayList<>(intervals.length);
        while ((y = queue.poll()) != null) {
            if (x == null) {
                break;
            }
            if (x[1] >= y[0]) {
                x[1] = Math.max(x[1], y[1]);
            } else {
                result.add(x);
                x = y;
            }
        }
        if (x != null) {
            result.add(x);
        }
        return result.toArray(new int[][]{});
    }
}
