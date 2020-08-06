package com.bipin.video.day15;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int [] [] arr={{23,34,56}, {12,23,45}, {67,78,89}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
