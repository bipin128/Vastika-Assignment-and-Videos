package com.bipin.assignment.question39;

import java.util.Scanner;

class Question39{
    public static void main(String[] args){
        System.out.println("Please enter a FirstName , MiddleName & LastName separated by spaces");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] arr = name.split(" ",3);
        System.out.println("................................................................................");
        System.out.println(arr[0].charAt(0)+"."+arr[1].charAt(0)+"."+arr[2]);
    }
}