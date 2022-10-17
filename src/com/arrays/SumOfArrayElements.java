package com.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements :");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of array elements :" + sum);
    }
}

