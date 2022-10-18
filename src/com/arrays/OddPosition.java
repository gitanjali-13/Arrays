package com.arrays;

public class OddPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,7,9};
        for (int i = 0; i < arr.length; i = i + 2){ // odd positon and for even position i =1; i < arr.lngth; i = i+2
            System.out.print(" "+arr[i]);

        }
    }
}
