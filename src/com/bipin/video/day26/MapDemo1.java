package com.bipin.video.day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(100,"Ram");
        studentMap.put(200,"Shyam");
        studentMap.put(300,"Hari");
        studentMap.put(400,"Gopal");

        System.out.println(studentMap);
        System.out.println(studentMap.get(100));
        System.out.println(studentMap.get(200));
        System.out.println(studentMap.get(300));

        System.out.println(studentMap.containsKey(100));
        System.out.println(studentMap.containsValue("hari"));

        //studentMap.clear();
        System.out.println(studentMap);
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.size());
        System.out.println(studentMap.remove(100));
        System.out.println(studentMap);
        Collection<String> c = studentMap.values();
        System.out.println(c);
    }
}
