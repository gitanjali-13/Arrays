package com.arrays;

public class SecondLargestNumber {
    private static int getSecondLargestNumber(int a[], int total) {
        int temp;
        for (int i = 0; i<total; i++){
            for (int j=i+1; j<total; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a[total-2];
    }
        public static void main(String[] args1) {
        int a[] = {2,1,3,4,11,7};
        int b[] = {1,2,6,8,0,3};
        System.out.println("second largest number " +getSecondLargestNumber(a, 6));
        System.out.println("second largest number " +getSecondLargestNumber(b,6));

    }


}
