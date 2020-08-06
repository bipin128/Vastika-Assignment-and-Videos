package com.bipin.video.day11;

public class MethodDemo1 {
    public void sayHello(){
        System.out.println("Hello From top of the World ");
    }

    public static void main(String[] args) {
        System.out.println("Main Start :");
        MethodDemo1 methodDemo1=new MethodDemo1();
        methodDemo1.sayHello();
        System.out.println("Main End ");
    }
}
