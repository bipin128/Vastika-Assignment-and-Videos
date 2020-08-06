package com.bipin.video.day7;

public class OperatorsDemo6 {
    public static void main(String[] args) {
        //Ternary Conditional Operator
        //?:

        int a=5;
        int b=10;

        if (a>b){
            System.out.println("A is greater than B. ");
        }
        else {
            System.out.println("B is greater than A. ");
        }
        String string=(a>b)?"A is greater than B.":"B is greater than A. ";
        System.out.println(string);

        boolean r= (a>b) ? true:false;
        System.out.println(r);
    }
}
