package com.workshop1.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("shreya");
        list.add("Manish");
        list.add("sdghj");
        System.out.println(list);

        //Traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
