package com.workshop1Review;

abstract class Demo {
    abstract void run();
    Demo(){

    }
}
class Dog extends Demo{
    @Override
    void run() {
        System.out.println("running.");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.run();

        }
}


