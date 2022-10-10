package com.arrays;

import java.util.Scanner;

public class UseOfScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //create scanner class and object
        System.out.println("Scanner :"); //print msg for user
        System.out.println("enter number1 :");
        int number = sc.nextInt();  // write variable with datatype integer
        //String name = sc.next();    // write string input
        //float number1 = sc.nextFloat();
        System.out.print("enter number2 :");
        int number2 = sc.nextInt();
//        int add = number +number2;
//        System.out.println("addition is : " );

        int sum = number + number2;
        System.out.println("Addition is :"+sum);
    }
}
