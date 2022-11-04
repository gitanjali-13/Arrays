package com.workshop2.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//Creating array list
        list.add("A");// Adding elements to list
        list.add("B");
        System.out.println("printing list :" + list);//Print list

        /*Using iterator traverse list and print*/
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("using iterator :" + itr.next());//pritn list using iterator

        }
        //iterating arraylist using for loop //
        for (String name : list) {
            System.out.println("using for each : " + name);//print list using for each loop
        }
    }
}
