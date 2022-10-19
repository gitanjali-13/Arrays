package com.basic;

interface print {
    void add();

}

class Test implements print {

    @Override
    public void add() {

        System.out.println("Hello");
    }

}

class Show implements print {

    @Override
    public void add() {
        System.out.println("byee");
    }
}

class Test3 {
    public static void main(String[] args) {
        print p1 = new Show();
        p1.add();
    }
}



