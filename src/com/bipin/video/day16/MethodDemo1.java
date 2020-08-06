package com.bipin.video.day16;

public class MethodDemo1 {
    public void sayHello() {
        System.out.println("Hello");
        return;
    }

    public void greet(String name) {
        System.out.println("Hello " + name + " Good Morning");
    }

    public static String returnInfo() {
        String name = "Bipin Khatiwada";
        String address = "Chesterfield,Missouri";
        return name + " " + address;
    }

    public static int findMax(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
}
