package com.forPractice;
//this and super keywords
public class Animals {
    public void eat(){
        System.out.println("Animals are eating.");
    }
}

class Dog extends Animals{

    public void eat(){
        System.out.println("Dogs are eating bread.");

    }
    public void bark(){
        System.out.println("dogs are barking.");
    }

    public void work(){
        super.eat();    //call parents class methods
        this.eat();     //call child class methods
        bark();
    }

}
class Cat extends Dog{
    public void eat(){
        System.out.println("cats are eating");
    }
    public void meow(){
        System.out.println("cat sounds meow");
    }
    public void work(){
        super.eat();
        meow();
    }

}

class Taste{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
        System.out.println("....................");
        Cat c = new Cat();
        c.work();
    }
}