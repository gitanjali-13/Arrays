package com.arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = new  int[]{1,2,3,4,5};
        int n = 4;
        System.out.println("original array");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        for (int i = 0; i < n; i++){
            int temp,j;
            temp = arr[0];
            for ( j =0; j< arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        System.out.println();
        for (int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }

    }
}
