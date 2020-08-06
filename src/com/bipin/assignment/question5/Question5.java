package com.bipin.assignment.question5;

import com.bipin.assignment.question4.Question4;

import java.util.Scanner;

public class Question5 {
    int r, l, b, h;
    double  area, area1, area2;
    final double PI=3.14;
    Scanner scanner = new Scanner(System.in);

    void circle() {
        System.out.println("Enter the Radius of the circle(R) : ");
        r = scanner.nextInt();
        area = PI * Math.pow(r,2);
        System.out.println("Area of Circle is : " + area);
    }

    void rectangle() {
        System.out.println("*********************************************");
        System.out.println("Enter the Length of the rectangle(L) : ");
        l = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle(B) : ");
        b = scanner.nextInt();
        area1 = l * b;
        System.out.println("Area of Rectangle is : " + area1);
    }

    void triangle() {
        System.out.println("****************************************************");
        System.out.println("Enter the breadth of the triangle(B) : ");
        b = scanner.nextInt();
        System.out.println("Enter the height of the triangle(H) :");
        h = scanner.nextInt();
        area2 = (b * h) / 2;
        System.out.println("Area of Triangle is : " + area2);
    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.circle();
        question5.rectangle();
        question5.triangle();

    }
}
