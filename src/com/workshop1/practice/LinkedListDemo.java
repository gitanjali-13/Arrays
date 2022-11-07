package com.workshop1.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("ram");
        list.add("shyam");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
