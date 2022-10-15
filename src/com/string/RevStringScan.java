package com.string;

import java.util.Scanner;

public class RevStringScan {

    public static void main(String[] args) {
        RevStringScan rs = new RevStringScan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str =  sc.nextLine();
        System.out.println("reverse string :" +rs.reverseStr(str));
    }
    static String reverseStr(String s){
        String str1 = " ";
        for (int i =s.length(); i > 0; i--){
            str1 = str1 +(s.charAt(i-1));
        }
        return str1;
    }

}
