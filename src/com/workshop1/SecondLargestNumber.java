package com.workshop1;

public class SecondLargestNumber {
    public String secondLargest(int[] num, int total) {
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (num[i] < num[j]) {
                    num[i] = num[i] + num[j];
                    num[j] = num[i] - num[j];
                    num[i] = num[i] - num[j];

                }
            }if(i == n - 1){

            }
        }
        return null;
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 4, 5, 6, 7, 9, 8};
        int n = 2;
        System.out.println("second largest number :" );
        SecondLargestNumber scl = new SecondLargestNumber();
        scl.secondLargest(a[]);


    }


}