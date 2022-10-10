package com.forPractice;

public class Operation {
    //Method overloading
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Operation.add(2,4));
        System.out.println(Operation.add(2,8,9));

    }
}
