package com.workshop1.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashmapIterate {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "geeta");
        map.put(2, "seeta");
        map.put(3, "neeta");
        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
