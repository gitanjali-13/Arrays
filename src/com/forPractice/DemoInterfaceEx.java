package com.forPractice;

interface DemoInterfaceEx {
    void display();

}
class Circle implements DemoInterfaceEx{
    public void display(){
        System.out.println("hello..");

    }

    public static void main(String[] args) {
        DemoInterfaceEx obj = new Circle();
        obj.display();
    }
}
