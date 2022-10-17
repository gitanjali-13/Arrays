package com.arrays;

public class SumofThreeNoZero {
    public static void main(String[] args) {
        int[] arr = {10,-4,6,1,3,-2,-3};
        int num = 0;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = i+1; j <= arr.length - 1; j++){
                for (int k = j+1; k < arr.length; k++ ){
                    if (arr[i] + arr[j] + arr[k] == num){
                        System.out.println(arr[i] + " " +arr[j]+ " " + arr[k]);
                    }
                }
            }
        }
    }
}
