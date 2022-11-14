package com.sports;

import com.workshop1.practice.ab.Person;

import java.util.*;
import java.util.stream.Collectors;

public class SportsMain {
    Scanner scanner;
    List<SportsPersonDetails> details = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SportsMain sportsMain = new SportsMain();

        int choice = 0;
        while (choice != 4) {
            System.out.println("enter your choice :: \n1.Person name: \n2.Search person: \n3.status \n4.Exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sportsMain.addPersonDetails();
                    break;
                case 2:
                    sportsMain.searchPerson();
                    break;
                case 3:
                    sportsMain.status();
                    break;
                default:
                    //System.out.println("Enter correct choice !!");
                    break;

            }
        }
    }

    public void addPersonDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person name :");
        String name = scanner.nextLine();
        System.out.println("Enter sports name :");
        String sport = scanner.nextLine();
        System.out.println("Enter active status of sports person :");
        String status = scanner.next();
        details.add(new SportsPersonDetails(name, sport, status));
        System.out.println(details);


    }
        public void searchPerson () {
            scanner = new Scanner(System.in);
            System.out.println("search person by name");
            String name = scanner.next();
            List<SportsPersonDetails> list = details.stream().filter(p -> p.sportPersonName.startsWith(name)).collect(Collectors.toList());
            //System.out.println(list);
            Iterator itr = list.listIterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }

        }

        public void status () {
            scanner = new Scanner(System.in);
            System.out.println("enter person name to check status : ");
            String personStatus = scanner.next();
            //ArrayList<SportsPersonDetails> list1 = (ArrayList<SportsPersonDetails>) details.stream().collect(Collectors.toList());
            List<SportsPersonDetails> list = details.stream().filter(p -> p.sportPersonName.startsWith(personStatus)).collect(Collectors.toList());
            System.out.println(list);

        }

}

