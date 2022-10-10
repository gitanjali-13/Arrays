package com.forPractice;

public class Vichle {
    public void run(){
        System.out.println("Vehicle is running.");

    }

}
class Car extends Vichle{

    public void run(){
        System.out.println("Car is running safely.");
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();
        Vichle v1 = new Vichle();
        v1.run();
    }
}
