package com.ws;
//Write a java code for sort an arraylist in ascending order using java8 features(stream functions).
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(8);
        Collections.sort(list);
        System.out.println("sorted list using collection : " +list);
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted list using stream : " +list1);
    }
}
