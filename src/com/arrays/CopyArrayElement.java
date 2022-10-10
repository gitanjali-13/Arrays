package com.arrays;

public class CopyArrayElement {
    public static void main(String[] args) {
        int arr1[] = new int[] {1,4,3,5,6,2};
        int arr2[] = new int[arr1.length];

        for (int i = 0; i< arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("original elements:");
        //System.out.println(arr2[]);
        for( int i = 0; i< arr1.length;i++){
            System.out.println(arr1[i]);

        }
        System.out.println();
        System.out.println("copy elements:");
        for(int i=0; i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
