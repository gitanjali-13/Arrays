package com.string;

public class CountChar {
    public static void main(String[] args) {
        String str = "java programming.";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ')
                count++;
            System.out.println("Total number of character of string:" + count);

        }
    }
}
