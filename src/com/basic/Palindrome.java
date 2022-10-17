package com.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rev = " ";
        System.out.println("Enter number :");
        String original = scanner.nextLine();
        int length = original.length();
        for (int i = length-1; i >= 0; i--){
             rev = rev + original.charAt(i);
             if (original.equals(rev)) {
                 System.out.println("enetred string is palindrome" + rev);
             }
             else
                 System.out.println("not palindrome.");
        }
    }
}
