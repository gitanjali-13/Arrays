package com.arrays;

import java.util.Scanner;

public class ElementOfarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[] = {2,4,6,2,7};

//        System.out.println("Enter elemnts");
//        int n = sc.nextInt();
//        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("enter number");
        int n = sc.nextInt();
        if ( n % 2 ==0){
            System.out.println("even number:" +n);

        }else {
            System.out.println("odd number" +n);
        }

    }
}
