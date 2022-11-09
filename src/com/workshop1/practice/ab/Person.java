package com.workshop1.practice.ab;

public class Person {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int zip_code;
    long phone_no;
    String email_id;

    public Person(String firstname, String lastname, String address, String city, String state, int zip_code, long phone_no, String email_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.address = address;
        this.state = state;
        this.phone_no = phone_no;
        this.zip_code = zip_code;
        this.email_id = email_id;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code=" + zip_code +
                ", phone_no=" + phone_no +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}
