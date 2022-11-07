package com.workshop1Review;

import java.util.Scanner;

public class ExampleArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter elements of elements");
            int number = sc.nextInt();
            int arr[] = new int[number];
            System.out.println(" enter elements for array :");
            for (int i = 0 ; i< number; i++){
                arr[i] = sc.nextInt();
            }

            for (int i =0; i<arr.length; i++){
                System.out.print(" "+arr[i]);
            }
        }
}
