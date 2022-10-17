package com.ws;

public class VarStatInstConst {
    int number;// instance variable
    int number2;
    static int num;//static variable

    public VarStatInstConst() {

    }

    static void m1() {
        System.out.println("static block of method");
    }
    void m2(){
        System.out.println("instance method");
    }


    public static void main(String[] args) {
        VarStatInstConst vs = new VarStatInstConst();
        vs.m2();
        m1();

    }
}
