package com.forPractice;

abstract class DemoAbsrt {
    abstract void run();
    }
    class Honda extends DemoAbsrt{
        @Override
        void run() {
            System.out.println("Running car.");
        }

        public static void main(String[] args) {
        DemoAbsrt bike = new Honda();
        bike.run();
        }
    }

