package com.bipin.video.day16;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------------------------------------------------");
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}
