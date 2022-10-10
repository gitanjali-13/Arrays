package com.arrays;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
//        int n = 100;
//        for ( int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i+ " ");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("even number");
        int n = sc.nextInt();
        //int i = 100;
        for (int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
