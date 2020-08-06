package com.bipin.assignment.question8;

import java.util.Scanner;

public class Question8 {
    double value1, f, value2, c;
    Scanner scanner = new Scanner(System.in);

    void intoCelsius() {
        System.out.println("Enter the Fahrenheit value(F) : ");
        f = scanner.nextInt();
        value1 = (f - 32) * 5 / 9;
        System.out.println("The Celsius value of given Fahrenheit value is : " + value1);
    }

    void intoFahrenheit() {
        System.out.println("*************************************************");
        System.out.println("Enter the Celsius value(C) :");
        c = scanner.nextInt();
        value2 = ((9 * c) / 5) + 32;
        System.out.println("The Fahrenheit value of given Celsius value is : " + value2);
    }

    public static void main(String[] args) {
        Question8 question8 = new Question8();
        question8.intoCelsius();
        question8.intoFahrenheit();
    }
}
