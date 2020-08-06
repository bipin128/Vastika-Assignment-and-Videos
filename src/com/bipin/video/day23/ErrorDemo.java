package com.bipin.video.day23;

public class ErrorDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[100000000];
        } catch (Exception e) {
            System.out.println("Inside Catch.");
            e.getStackTrace();
        }
        System.out.println("end");
    }
}
