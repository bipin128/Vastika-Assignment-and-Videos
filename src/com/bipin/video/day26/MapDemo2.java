package com.bipin.video.day26;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,String > studentMap=new HashMap<>();
        studentMap.put(100,"Apple");
        studentMap.put(200,"Ball");
        studentMap.put(300,"Cat");
        studentMap.put(400,"Dog");
        studentMap.put(500,"Elephant");

        for (Map.Entry<Integer,String> student : studentMap.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
