package com.bipin.video.day26;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {

    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 5, 2, 7 };
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 9));

        int [] ar = Arrays.copyOf(arr1, 6);
        System.out.println(Arrays.toString(ar));

        List<Integer> l = Arrays.asList(4,5,3,7,8);
        System.out.println(l);

    }

}
