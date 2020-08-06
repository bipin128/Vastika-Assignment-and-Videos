package com.bipin.video.day26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

    public static void main(String[] args) {
        Map<Integer, String> studentMap1 = new HashMap<>();
        studentMap1.put(200, "Apple");
        studentMap1.put(300, "Ball");
        studentMap1.put(500, "Cat");
        studentMap1.put(100, "Dog");
        studentMap1.put(400, "Elephant");
        studentMap1.put(700, "Frog");
        studentMap1.put(600, "Goat");

        System.out.println("Using HashMap: ");
        for (Map.Entry<Integer, String> student : studentMap1.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

        System.out.println();
        Map<Integer, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(200, "Apple");
        studentMap2.put(300, "Ball");
        studentMap2.put(500, "Cat");
        studentMap2.put(100, "Dog");
        studentMap2.put(400, "Elephant");
        studentMap2.put(700, "Frog");
        studentMap2.put(600, "Goat");

        System.out.println("Using linked HashMap: ");
        for (Map.Entry<Integer, String> student : studentMap2.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

        System.out.println();
        Map<Integer, String> studentMap3 = new TreeMap<>();
        studentMap3.put(200, "Apple");
        studentMap3.put(300, "Ball");
        studentMap3.put(500, "Cat");
        studentMap3.put(100, "Dog");
        studentMap3.put(400, "Elephant");
        studentMap3.put(700, "Frog");
        studentMap3.put(600, "Goat");

        System.out.println("Using tree map: ");
        for (Map.Entry<Integer, String> student : studentMap3.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }

}
