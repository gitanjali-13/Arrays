package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("Gitanjali");
        list.add("sneha");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter element");
        String string = scanner.next();

        for (String s : list) {
            if (s == string) {
                System.out.println("element found");
            } else {
                System.out.println("not found");
            }
        }
    }
}
