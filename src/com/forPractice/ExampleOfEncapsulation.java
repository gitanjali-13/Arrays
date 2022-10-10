package com.forPractice;

public class ExampleOfEncapsulation {
    private String name;
    private int rollNo;
    private String collegeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }


    public ExampleOfEncapsulation(String name, int rollNo, String collegeName) {
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }
    //public void display(){
    // System.out.println(name+" "+rollNo+" "+collegeName+" " );

    // }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ExampleOfEncapsulation s[] = new ExampleOfEncapsulation[3];

        s[0] = new ExampleOfEncapsulation("sreekanth", 1, "bridgelabz");
        s[1] = new ExampleOfEncapsulation("ram", 2, "bridgelabz1");
        s[2] = new ExampleOfEncapsulation("ajeet", 3, "bridgelabz2");
        for (int i = 0; i < s.length; i++) {

            System.out.println(s[i]);
        }

    }
}