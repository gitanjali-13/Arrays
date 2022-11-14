package com.workshop1.practice.lambda;

interface Sayable{
    public String say( String name);
}
public class Demo2 {
    public static void main(String[] args) {

        Sayable s1 = (name)->{
            return name;
        };
        System.out.println( s1.say("gitanajli"));
        Sayable s2 = (name) ->{
            return name;
        };
        System.out.println(s2.say("deshmukh"));
    }
}
