package com.bipin.video.day7;

public class TypeCastingDemo1 {
    public static void main(String[] args) {
        //implicit casting
        //by compiler
        int b=127;
        int i=b;
        System.out.println("i is " + i);
        System.out.println("b is " + b);

        //explicit casting
        //by programmer
        int ii=200;
        byte bb=(byte) ii;
        System.out.println("ii is " + ii);
        System.out.println("bb is " + bb);
    }
}
