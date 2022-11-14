package com.workshop1.practice.lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoFor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gita");
        list.add("sita");
        list.add("nikita");
        list.add("sangita");
        System.out.println("Iterating string by for each.");

        list.forEach(System.out::println);

        list.stream().forEachOrdered(System.out::println);

        list.stream().forEach(list1-> System.out.println(list1));
            
        }
    }
