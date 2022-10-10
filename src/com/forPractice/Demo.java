package com.forPractice;

public class Demo {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Demo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo d1[] = new Demo[2];
        d1[0] = new Demo("Geetanjali","Pune");
        d1[1] = new Demo("Shweta","Nanded");
        for (int i =0; i<d1.length;i++){
            System.out.println(d1[i]);
        }
    }
}