package com.basic;

public abstract class Demo2 {
    public abstract void add() ;


}
class Circle extends Demo2{

    @Override
    public void add() {
        System.out.println("cirlce");
    }
}
class Rectangle extends Demo2{

    @Override
    public void add() {
        System.out.println("rectangle ");
    }
}
class Test1{
    public static void main(String[] args) {
        Demo2 d1 = new Rectangle() ;

        d1.add();

    }
}