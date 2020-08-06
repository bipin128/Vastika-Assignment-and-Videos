package com.bipin.video.day17;

public class Derived extends Base {
    String name="Childs Name";

    public void sayHi() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("Hi from child...");
    }
}