package com.bipin.video.day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(40);
        l.add(10);
        l.add(30);

        System.out.println(l);

//		l.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if (o1 > o2) {
//					return 1;
//				} else {
//					return -1;
//				}
//
//			}
//		});

//		l.sort((o1, o2) -> {
//			if (o1 > o2) {
//				return 1;
//			} else {
//				return -1;
//			}
//
//		});

        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, 50));


    }

}
