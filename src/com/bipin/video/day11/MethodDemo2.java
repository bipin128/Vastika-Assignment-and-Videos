package com.bipin.video.day11;

import java.util.Scanner;

public class MethodDemo2 {
    public void printInfo(String name,int age){
        System.out.println("My Name is: " + name);
        System.out.println("My age is: " +age);
    }

    public static void main(String[] args) {
        MethodDemo2 methodDemo2=new MethodDemo2();
        methodDemo2.printInfo("Bipin Khatiwada",24);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=scanner.nextLine();
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        methodDemo2.printInfo(name,age);
    }
}
