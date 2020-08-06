package com.bipin.video.day2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(4 + 5);
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        int sum = a + b;
        System.out.println("The sum of two numbers a and b is :" + sum);
        System.out.println("The sum of two numbers [a] " + a  + " and [b] " + b + " is " + sum);

        int sub= a-b;
        System.out.println("The Subtraction of two numbers [a] " + a  + " and [b] " + b + " is " + sub);

        int mul=a*b;
        System.out.println("The multiplication of two numbers [a] " + a  + " and [b] " + b + " is " + mul);

        int div=a/b;
        System.out.println("The Division of two numbers [a] " + a  + " and [b] " + b + " is " + div);

    }
}