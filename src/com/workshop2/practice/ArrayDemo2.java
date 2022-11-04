package com.workshop2.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Geeta");
        list.add("Seeta");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
