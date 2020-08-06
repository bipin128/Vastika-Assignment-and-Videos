package com.bipin.video.day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(40);
        l.add(10);
        l.add(30);

        System.out.println(l);
        l.add(50);
        System.out.println(l);

        List<Integer> ll = Collections.unmodifiableList(l);
        System.out.println(ll);
//		ll.add(60);
//		System.out.println(ll);

    }

}