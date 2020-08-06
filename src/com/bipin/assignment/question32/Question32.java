package com.bipin.assignment.question32;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int size=scanner.nextInt();

        int[]arr=new int[size];
        System.out.println("Enter the Elements ");
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
