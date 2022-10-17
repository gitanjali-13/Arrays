package com.arrays;

public class OddEvenInArray {


    public static void main(String[] args) {
        int[] arr = {5,2,7,9,3,1};
        System.out.println("even numbers :");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0 ){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("odd numbers : ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
