package com.workshop2.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrlistDemo {
    int age;
    String name;

    public ArrlistDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class New {
    public static void main(String[] args) {
        List<ArrlistDemo> list = new ArrayList<>();
        list.add(new ArrlistDemo(20, "Shyam"));
        list.add(new ArrlistDemo(25, "ram"));
        //using stream API
        List<Integer> age = list.stream().filter(a -> a.age > 20).map(a -> a.age).collect(Collectors.toList());
        System.out.println(age);

    }

}
