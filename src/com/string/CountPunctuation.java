package com.string;

public class CountPunctuation {
    public static void main(String[] args) {
        String str = "Hey!! What's up ! are u coming:";
        int count = 0;
        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '\"' || str.charAt(i) == ':'){
                count++;
            }
        }
        System.out.println("The number of punctuation symbols are :" +count);
    }
}
