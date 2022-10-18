package com.basic;

import java.util.Scanner;

public class PalindromeStringMethod {
    public void palindromeNum(String s) {
        String rev = "";
        for (int i = s.length() -1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println(s + " It is palindrome");
        } else {
            System.out.println(s + " It is not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String string = scanner.next();
//        StringBuilder s1 = new StringBuilder(string);
//        s1.reverse();
//        if (string.equals(s1)) {
//            System.out.println(s1 + " It is palindrome");
//        } else {
//            System.out.println(s1 + " It is not palindrome");
//        }
        PalindromeStringMethod pn = new PalindromeStringMethod();
        pn.palindromeNum(string);
    }
}
