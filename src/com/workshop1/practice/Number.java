package com.workshop1.practice;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr how many numbers u want to print : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println("elements are :" + num);
    }
}
