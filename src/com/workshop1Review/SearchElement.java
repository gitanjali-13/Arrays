package com.workshop1Review;

import java.util.Scanner;

public class SearchElement {
    public static String[] searchElement(String[] s) {
        Scanner scanner = new Scanner(System.in);
        String[] str1 = new String[5];
        System.out.println("Enter string :");
        char ch = scanner.next().charAt(0);
        int temp = 0;
        for (int i = 0; i < s.length; i++) {

            String str = s[i];
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    str1[temp] = str;
                    temp++;
                } else if (str.charAt(j) != ch) {
                    s[i] = str1[i];

                }
            }
        }
        return str1;

    }

    public static void main(String[] args) {
        String[] str = {"java", "Programming", "Python", "sql", "NOsql"};
        String[] search = searchElement(str);

        for (int i = 0; i < search.length; i++) {
            System.out.println(" " + search[i]);
        }
    }
}
