package com.string;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    void filter(List list) {

        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    void primeNumber(List list1) {

        for (int i = 1; i <= list1.size(); i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        System.out.println(list);
        Sample sample = new Sample();
        sample.filter(list);
        System.out.println();

        System.out.println("Prime Numbers Between 1 to 100");

        List<Integer> list1 = new ArrayList<>();
        int n = 100;
        for (int i = 1; i <= n; i++) {
            list1.add(i);
        }
        Sample sample1 = new Sample();
        sample1.primeNumber(list1);

    }
}

