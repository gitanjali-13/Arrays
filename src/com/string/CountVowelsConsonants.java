package com.string;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        int count = 0;
        String str = "GitanjaliDeshmukh";
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a' ||
            str.charAt(i) == 'A' ||
            str.charAt(i) == 'e' ||
            str.charAt(i) == 'E' ||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'I' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'O' ||
            str.charAt(i) == 'u' ||
            str.charAt(i) == 'U'){
                count++;
                //System.out.println("Its vowels : " +count);
            }else if(str.charAt(i) >='a' ||str.charAt(i) == 'A'
                    && str.charAt(i) <='z' || str.charAt(i) =='Z'){
                count++;
            }
        }
        System.out.println("vowels"+count);
        System.out.println("consonants ."+ count);
    }
}
