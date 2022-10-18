package com.basic;

import java.util.Scanner;

public class Demo {
    public void primeNumber( int num ){
        int count = 0;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("It is Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int number = scanner.nextInt();
        Demo d1 = new Demo();
        d1.primeNumber(number);

    }
}
