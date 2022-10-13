package com.bl.stat;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check whether it is maximum?");
        System.out.println("enter three numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        findMaxNumber(num1,num2,num3);
    }

    public static void findMaxNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number is greater :" + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number us greater :" + num2);
        } else {
            System.out.println("number is greater " + num3);
        }
    }
}
