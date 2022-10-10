package com.arrays;

import java.util.ArrayList;

public class AddTwoList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Geetanjali");
        list1.add("Deshmukh");
        System.out.println("list1 = " +list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Bridgelabz");
        list1.addAll(list2);
        System.out.println("Merged list" +list1);

    }
}
