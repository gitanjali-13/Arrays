package com.string;

public class RemoveSpaceForloop {
    public static void main(String[] args) {
        String str = "Hello  welcome to java programming.";
        //String str1 ="Hello world I am here";
        // using for each loop
        for (char c : str.toCharArray()) {
            if (c != ' ')
                System.out.print(c);
        }
    }
}
