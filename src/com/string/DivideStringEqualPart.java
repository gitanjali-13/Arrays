package com.string;

public class DivideStringEqualPart {
    public static void main(String[] args) {
        String str = "aaabbbcccdddeee";
        int length = str.length();
        int n = 2;
        int temp = 0;
        int chars = length/n;
        String[] equalStr = new String[n];

        if (length % n != 0){
            System.out.println("Cannot divide into " +n+ "equal parts.");

        }
        else {
            for (int i =0; i<length; i++){
                String eqlPart =str.substring(i,i+chars);
                equalStr[temp] = eqlPart;
                temp++;

            }
            System.out.println("equal parts :" +n);
            for (int i =0; i<equalStr.length; i++){
                System.out.println(equalStr[i]);
            }
        }

    }
}
