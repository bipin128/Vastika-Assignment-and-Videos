package com.bipin.video.day7;

//explicit typecasting
public class TypeCastingDemo3 {
    public static void main(String[] args) {
        double d = 100.45;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("d is " + d);
        System.out.println("f is " + f);
        System.out.println("l is " + l);
        System.out.println("i is " + i);
        System.out.println("s is " + s);
        System.out.println("b is " + b);

    }
}
