package com.bipin.video.day26;

import java.util.Comparator;

public class User implements Comparator<User> {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }

    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }

    }

}
