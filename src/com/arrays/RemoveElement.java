package com.arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int a[] = {2,1,4,6,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elemnet");
        int element = sc.nextInt();
        int count = 0;
        for (int i = 0; i<a.length; i++) {
            if (element == a[i]) {
                for (int j = i; j < a.length; j++) {
                    a[j] = a[j+1];
                    count++;
                }
            }
        }

        for (int i = 0; i<a.length-1; i++) {
            System.out.println(a[i]+" ");
        }
            System.out.println();
    }
}
