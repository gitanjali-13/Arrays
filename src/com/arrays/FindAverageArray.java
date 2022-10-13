package com.arrays;

public class FindAverageArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0; i<a.length; i++){
            sum = sum + a[i];
//            System.out.println(sum+ " "+ a.length);
        }
            avg = sum / a.length;
        System.out.println("Average is "+avg);
    }
}
