package com.bipin.video.day17;

public class Sub extends Super{

    public Sub(){
        super(5);
        System.out.println("Child's Default Constructor");
    }
    public Sub(int a) {
        super();
        System.out.println("Child's arg Constructor");
    }
}
