package com.string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "remove spaces in string.";
        str = str.replaceAll("\\s+","");//using regex
        System.out.println("String after removing spaces" +str);

    }
}
