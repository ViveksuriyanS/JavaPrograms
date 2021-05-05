package com.arrays;

import java.util.Arrays;

public class SecondSmall {

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 4, 8, 1};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }

    public static void secondSmall(int[] inp) {
        int s1 = inp[0];
        int s2 = s1;
        for (int i = 1; i < inp.length; i++) {
            if (s1 > inp[i]) {
                s1 = s2 = inp[i];
            } else if (s2 > inp[i]) {
                s2 = inp[i];
            }
        }
        System.out.println(s2);
    }
}
