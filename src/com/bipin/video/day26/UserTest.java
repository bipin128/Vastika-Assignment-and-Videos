package com.bipin.video.day26;

import java.util.Collection;
import java.util.TreeSet;

public class UserTest {

    public static void main(String[] args) {

        TreeSet<User> users = new TreeSet<User>(new User());
        users.add(new User("ram", 22));
        users.add(new User("gopal", 42));
        users.add(new User("hari", 32));
        users.add(new User("krishna", 12));

        for (User user : users) {
//			System.out.println(user.getName() + " " + user.getAge());
            System.out.println(user);
        }

        System.out.println("================");
        System.out.println(users.first());
        System.out.println(users.last());
    }

}
