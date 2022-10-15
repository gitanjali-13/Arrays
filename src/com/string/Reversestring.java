package com.string;

public class Reversestring {
    public static void main(String[] args) {
        String str = "hello Everyone";
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is :" +rev);

    }
}
