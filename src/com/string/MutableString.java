package com.string;

public class MutableString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Gitanjali ");
        stringBuffer.append("Deshmukh");
        stringBuffer.insert(0,"Name ");
        stringBuffer.replace(1,4,".");
        stringBuffer.delete(1,2);
//        stringBuffer.reverse();
//        stringBuffer.capacity();
//        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);

    }
}
