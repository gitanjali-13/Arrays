package com.string;

public class Demo<T> {

    public void method(T[] arr) {
        for (T s : arr) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] strings = {"gita", "sita", "arjun"};

        Demo p3 = new Demo<>();
        p3.method(integers);
        System.out.println();
        p3.method(strings);
    }
}

