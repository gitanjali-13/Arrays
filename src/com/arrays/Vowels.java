package com.arrays;

public class Vowels {
    public void vowels(String arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {

                    count++;
                }
            }
        }
        System.out.println("Number of vowels  = "+count );
    }

    public static void main(String[] args) {
        String arr[] = {"Gitanjali"};

        Vowels v = new Vowels();
        v.vowels(arr);
    }
}