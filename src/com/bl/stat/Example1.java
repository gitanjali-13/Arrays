package com.bl.stat;

import java.util.Scanner;

public class Example1 {
    public static int evenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("It is even number.");
        } else {
            System.out.println("It is odd number.");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number.");
        int num = scanner.nextInt();
        evenOdd(num);
    }
}
