package com.workshop1;

public class Vowels {
    public void vowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

                count++;
            } else if (s.charAt(i) >= 'a' || s.charAt(i) == 'A') {
                count++;

            }

        }
        System.out.println(" "+count );
    }

    public static void main(String[] args) {
        String str = "Gitanjali";

        Vowels v = new Vowels();
        v.vowels(str);
    }

}