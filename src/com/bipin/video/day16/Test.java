package com.bipin.video.day16;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main Method");
        MethodDemo1 methodDemo1 = new MethodDemo1();
        methodDemo1.sayHello();
        methodDemo1.greet("Trump");
        String r = methodDemo1.returnInfo();
        System.out.println(r);
        int m = methodDemo1.findMax(22, 25);
        System.out.println(m);
    }
}