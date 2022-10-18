package com.basic;

public class Palindromestring {
        public static void main(String[] args) {
            String str = "rar";
            StringBuilder sc = new StringBuilder(str);
            sc.reverse();
            String s2 = sc.toString();
            if (str.equals(s2)){
                System.out.println("palidrome");
            }else {
                System.out.println("not palidrome");
            }
        }
    }

