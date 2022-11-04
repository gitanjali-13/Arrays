package com.forPractice;

public class Polymorphism {
    void add(int a , int b){
        int sum = a + b;
        System.out.println(" addition :" + sum );
    }
    void add(int a, int b , int c){
        int sum = a + b + c;
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.add(2,4);
    }
}
