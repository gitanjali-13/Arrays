package com.forPractice;

public class Student {
    //Instance variable
    String name;
    int roll_no;
    //Static variable
    static String school_Name = "Bridgelab";

    public Student(String name, int roll_no, String bridgelabz) {
        this.name = name;
        this.roll_no = roll_no;
    }
    public void display(){
        System.out.println(name+" "+roll_no+" "+school_Name);
    }
    public static void change(){
        school_Name = "SSPU";
    }

    public static void main(String[] args) {
        change();

        //ExampleOfEncapsulation s1 = new ExampleOfEncapsulation("Geetanjali",01);
        //ExampleOfEncapsulation s2 = new ExampleOfEncapsulation("Shweta",02);
    }

}
