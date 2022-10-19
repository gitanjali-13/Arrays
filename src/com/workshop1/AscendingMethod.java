package com.workshop1;

public class AscendingMethod {
    public void ascending(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println();
        System.out.println("after ascending : ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,3,5,12,8,9,43,15};
        System.out.println("before sorting ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        AscendingMethod ascending = new AscendingMethod();
        ascending.ascending(arr);
    }
}
