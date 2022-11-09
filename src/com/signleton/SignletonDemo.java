package com.signleton;

public class SignletonDemo {
    //Singleton class is not predefined class its like design approach.
    //create private constructor, attribute,
    //only having one instance.
    //our goal is created a class that can have one object, that is singleton class.
    //create method to access the method
    //create an only object, we can create multiple reference var to access this object
    private static SignletonDemo sc;
    //create  private ,static , reference object of class
    private SignletonDemo() {
        //create constructor as private which restrict the constructor that cannot use outside class.
    }
    //to create a method which refers to only one object of the class sice it can be static.

    public static SignletonDemo getInstance() {
        if (sc == null) {
            //check if object is null then create new object.
            sc = new SignletonDemo();

        }//else use same object
        return sc;

    }
    public void print(){
        System.out.println("Hello world. ");
    }
}
class Demo{
    public static void main(String[] args) {
        //Type of variable
        SignletonDemo signletonDemo;
        //variale = variableType.method
        signletonDemo = SignletonDemo.getInstance();
        //variable.method
        signletonDemo.print();

        SignletonDemo s1;
        s1 = SignletonDemo.getInstance();
        s1.print();
    }
}

