package com.string;

public class palindromeStr {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("palindrome string " );
        } else {
            System.out.println("not a palindrome string." );
        }
    }
}