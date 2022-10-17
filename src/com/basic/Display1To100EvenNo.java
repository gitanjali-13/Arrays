package com.basic;

public class Display1To100EvenNo {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("number from 1-100 :" + number);
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++ ){
            if (i % 2 == 1){
                System.out.print( i+ " ");
            }
        }
    }
}

