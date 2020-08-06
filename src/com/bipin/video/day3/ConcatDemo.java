package com.bipin.video.day3;

public class ConcatDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String name = "Bipin Khatiwada";

        System.out.println("Hello ");
        System.out.println("Hello ".concat(name));
        System.out.println("Hello " + name);
        System.out.println(a+b);
        System.out.println(a+ " " + b);
        System.out.println("The sum is : " +a + b);
        System.out.println("The sum is : " +(a + b));

    }
}
