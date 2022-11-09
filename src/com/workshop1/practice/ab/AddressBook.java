package com.workshop1.practice.ab;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Scanner;

public class AddressBook {
    Scanner sc;
    ArrayList<Person> list = new ArrayList<>();

    public void addPerson() {
        sc = new Scanner(System.in);

        System.out.println("Enter first name :");
        String firstName = sc.next();
        System.out.println("enter last name :");
        String lastName = sc.next();
        System.out.println("enter address :");
        String address = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        System.out.println("enter state");
        String state = sc.next();
        System.out.println("enter zip code");
        int zip_code = sc.nextInt();
        System.out.println("enter phone number");
        long phone_no = sc.nextLong();
        System.out.println("enter email_id");
        String email_id = sc.next();
        list.add(new Person(firstName, lastName, address, city, state, zip_code, phone_no, email_id));

    }

    private void editPerson() {
        System.out.println("enter person name to edit person");
        String editPersonName = sc.next();
        Person person = getPerson(editPersonName);
        System.out.println("Enter what you want to edit : 1-FirstName\n2-LastName\n3-address\n4-City\n4-state\n5-zipcode\n6-phone_no\n7-email_id");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                editFirstName(person);
                break;
            case 2:
                editlastname(person);
                break;
            case 3:
                editAddress(person);
                break;
            case 4:
                editCity(person);
                break;
            case 5:
                editState(person);
                break;
            case 6:
                editZipcode(person);
                break;
            case 7:
                editPhoneno(person);
                break;
            case 8:
                editemailid(person);
                break;
            default:
                System.out.println("enter valid choice");
        }

    }

    private void editFirstName(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your first name ");
        person.firstname = sc.next();
    }

    private void editlastname(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your last name ");
        person.lastname = sc.next();
    }

    private void editAddress(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your address ");
        person.address = sc.next();
    }

    private void editCity(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your city name ");
        person.city = sc.next();
    }

    private void editState(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your state name ");
        person.state = sc.next();

    }

    private void editZipcode(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter zipcode ");
        person.zip_code = sc.nextInt();
    }

    private void editPhoneno(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter phone number ");
        person.phone_no = sc.nextLong();
    }

    private void editemailid(Person person) {
        sc = new Scanner(System.in);
        System.out.println("enter your email id ");
        person.email_id = sc.next();
    }

    private Person getPerson(String editPersonName) {
        Iterator itr = list.iterator();
        Person person;
        if (itr.hasNext()) {
            for (int i = 0; i < list.size(); i++) {
                person = (Person) itr.next();
                if (person.firstname.equalsIgnoreCase(editPersonName)) {
                    return person;
                }
            }
        }
        return null;
    }

    private void deleteperson() {
        sc = new Scanner(System.in);
        System.out.println("enetr person name to delete: ");
        String firstname = sc.next();
        Person person = getPerson(firstname);
        if (person == null) {
            System.out.println("Sorry no person found given name!!");
        } else {
            list.remove(person);
        }
    }

    private void searchperson() {
        sc = new Scanner(System.in);
        int count = 0;
        System.out.println("search person by city");
        String city = sc.next();
        for (Person person : list) {
            if (person.city.equalsIgnoreCase(city)) {
                System.out.println(person);
                count++;

            }
        }
    }

    public void display() {

        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddressBook ab = new AddressBook();
        int choice = 0;
        while (choice != 6) {
            System.out.println("please enter your choice :\n 1-addPerson\n2-editPerson\n3-detetePerson\n4-searchPerson\n5-showPerson\n6Invalid");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    ab.editPerson();
                    break;
                case 3:
                    ab.deleteperson();
                    break;
                case 4:
                    ab.searchperson();
                    break;
                case 5:
                    ab.display();
                    break;
                case 6:
                    System.out.println("Invalid choice");
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }
}


