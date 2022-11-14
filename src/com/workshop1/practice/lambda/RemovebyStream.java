package com.workshop1.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovebyStream {
    Scanner sc = new Scanner(System.in);

    public void remove(List<String> list){
        ArrayList<String> newList = new ArrayList<>();
        System.out.println("Enter string to remove .");
        String name = sc.next();
        list.stream().filter(p -> p.equals(name)).forEach(p -> newList.add(p));

        if (newList.size() == 0){
            System.out.println("Strign not found.");
        }else{
            list.removeAll(newList);
            System.out.println("remove successfully");
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        RemovebyStream removebyStream = new RemovebyStream();
        List<String> list = new ArrayList<>();
        list.add("Gitanjali");
        list.add("Sgweta");
        list.add("manoj");
        list.add("deshmukh");
        list.add("aaaaa");
        System.out.println(list);
        removebyStream.remove(list);
    }
}
