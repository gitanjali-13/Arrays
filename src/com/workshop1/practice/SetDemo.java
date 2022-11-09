package com.workshop1.practice;

import java.util.HashSet;

import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
