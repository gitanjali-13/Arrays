package com.string;

public class StringEqualsMethod {
    public static void main(String[] args) {

////////********using equals method********////////////////

        String str1 = "Gitanjali";
        String str2 = "Gitanjali";
        String str3 = new String("Manoj");
        String str4 = "Gaurav";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

////////*******using Equals ignore case********/////////////////

        String S1 = "Gitanjali";
        String s2 = "gitanjali";
        String s3 = "Deshmukh";
        System.out.println(str1.equalsIgnoreCase(s2));
        System.out.println(str1.equalsIgnoreCase(s3));
    }
}
