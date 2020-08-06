package com.bipin.assignment.question27;

import java.util.Scanner;

public class Question27 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number=scanner.nextInt();
        int sum=0;
        int mul=1;

        while (number!=0){
            int temp= number%10;
            sum=sum+temp;
            mul=mul*temp;
            number=number/10;
        }
        System.out.println("The sum of the Digits in the number is :" + sum);
        System.out.println("The multiplication of the Digits in the number is :" + mul);

    }
}