package com.string;

public class SwapStringWithoutTemp {
    public static void main(String[] args) {
        String str1 = "Gitanjali" , str2 = "Shweta";
        System.out.println("original string :" +str1+ " " +str2);
        str1 = str1 +str2;
        str2 = str1.substring(0,(str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("After swapping :" +str1+ " " +str2);
    }
}
