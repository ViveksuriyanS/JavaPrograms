package com.version.java8;

import java.util.Arrays;

public class ParallelSorting {
    public static void main(String[] args) {
        int[] ar = {1,4,8,9,2,0,3,5,7,6};
        Arrays.parallelSort(ar);
        System.out.println(Arrays.toString(ar));

    }
}
