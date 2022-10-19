package com.basic;

public class NumberM {

    public static void printWithoutloop(int n){
        if (n > 0){
            printWithoutloop(n -1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printWithoutloop(10);
    }
}