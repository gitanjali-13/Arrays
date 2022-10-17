package com.ws;

import java.util.Scanner;

public class Printarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of an array :");

        for (int i =0; i < arr.length; i++){
           arr[i] = scanner.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
