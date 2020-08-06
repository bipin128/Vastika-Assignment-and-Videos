package com.bipin.video.day16;

import java.util.Scanner;

public class MethodDemo3 {
    public static void sumElementOfArray(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        System.out.println("The sum of Array is " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        MethodDemo3.sumElementOfArray(arr);

        MethodDemo3.sumElementOfArray(new int[] {1,2,3,4,5,6,8,9});

        int [] ar=MethodDemo2.returnArray(new Scanner(System.in));
        MethodDemo3.sumElementOfArray(ar);

        MethodDemo3.sumElementOfArray(1,2,3,4,5,6,7,8,9,8);

    }
}
