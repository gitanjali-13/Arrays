package com.string;

public class AkStringDemo {
    public static void main(String[] args) {
        String str = "Java is Love..";
        String[] words = str.split(" ");

        System.out.println("---output1----");
        for (int i = 0; i <= words.length-1; i++){
            System.out.println(words[i] + words[i].length()+ " ");
        }
    }
}
