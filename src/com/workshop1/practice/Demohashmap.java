package com.workshop1.practice;

import java.util.HashMap;

import java.util.Map;

public class Demohashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "geeta");
        map.put(2, "hjgd");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
