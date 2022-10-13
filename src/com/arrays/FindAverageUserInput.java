package com.arrays;

import java.util.Scanner;

public class FindAverageUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements : ");
        int size = scanner.nextInt();
        double arr[] = new double[size];
        double sum = 0.0;
        double avg = 0.0;
        System.out.println("entr element of array :");
        for (int i = 0; i<arr.length;i++){
            arr[i] = scanner.nextDouble();
            sum = sum + arr[i];

        }
        avg = sum / arr.length;
        System.out.println("average is : " +avg);
    }
}
