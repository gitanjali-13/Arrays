package com.arrays;

public class SmallestElementArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,8,9};
        System.out.print("original element");
        int smallest = arr[0];
        for (int i = 0; i<arr.length;i++){
            if( arr[i] < smallest){
                smallest = arr[i];

            }
            //System.out.println();
            System.out.println(smallest);
        }
    }
}
