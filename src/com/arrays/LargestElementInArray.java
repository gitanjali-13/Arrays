package com.arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,8,9};
        int largest = 0;
        System.out.println("original array");
        for (int i = 0; i<arr.length;i++){
            if( arr[i] > largest){
                largest = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}
