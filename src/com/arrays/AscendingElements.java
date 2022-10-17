package com.arrays;

public class AscendingElements {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,9,5};
        int temp;
        System.out.println("origignal array :");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("after ascending order" );
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i] +" ");
        }
    }
}
