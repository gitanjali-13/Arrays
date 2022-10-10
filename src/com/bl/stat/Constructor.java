package com.bl.stat;

public class Constructor {
        String name;
        int age;
        public Constructor() {
            name  = "ajeet";
            age = 45;
            System.out.println(name+" "+age);
        }
        public Constructor(Constructor ib) {
            this.name = ib.name;
            this.age = ib.age;
            System.out.println(name+" "+age);
        }
    }
    class b{
        public static void main(String args[]) {
            Constructor sc = new Constructor();
            Constructor sc1 = new Constructor(sc);
        }
    }

