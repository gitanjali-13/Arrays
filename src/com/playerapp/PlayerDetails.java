package com.playerapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayerDetails {
    ArrayList<Player> list = new ArrayList<>();
    Scanner sc;

    public void addPlayer() {
        list.add(new Player("Rohit Sharma", "Cricket", "Not Retired"));
        list.add(new Player("Virat Kholi", "Cricket", "Not Retired"));
        list.add(new Player("Sachin Tendulkar", "Cricket", "Retired"));
        list.add(new Player("Rahul Sharma", "Cricket", "Retired"));
        list.add(new Player("Raspreet Sidhu ", "Basketball", "Not Retired"));
        list.add(new Player("Dhruv Singh", "Basketball", "Not Retired"));
        list.add(new Player("Karim Abdul", "Basketball", "Retired"));
        list.add(new Player("Kevin Durant", "Basketball", "Retired"));
        list.add(new Player("PR Sreejesh", "Hockey", "Not Retired"));
        list.add(new Player("Manpreet Singh", "Hockey", "Not Retired"));
        list.add(new Player("Hardik singh", "Hockey", "Not Retired"));
        list.add(new Player("Rupindar singh", "Hockey", "Retired"));
        list.add(new Player("Satish Rai", "Kho Kho", "Not Retired"));
        list.add(new Player("Pravin Kumar", "Kho Kho", "Not Retired"));
        list.add(new Player("Pankaj Malhotra", "Kho Kho", "Retired"));
        list.add(new Player("Mandakini Majhi", "Kho Kho", "Retired"));
        System.out.println("--------------------------------------");
        System.out.println(list);
        Iterator<Player> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------------------------------------");

    }

    public void searchPlayer() {
        sc = new Scanner(System.in);
        System.out.println("Enter name to search player:- ");
        String name = sc.next();
        list.stream().filter(player -> player.getName() == "name").forEach(System.out::println);
        // System.out.println(list1);
        // boolean l = list.stream().anyMatch(x -> name.equals(toString()));
        //System.out.println(l);
    }

    public void statusOfPlayer() {
        System.out.println("---------------------------------------");
        System.out.println("List of player who are not retired:- ");
        list.stream().filter(player -> player.getStatus() == "Not Retired").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of player who are retired:- ");
        list.stream().filter(player -> player.getStatus() == "Retired").forEach(System.out::println);
        System.out.println("---------------------------------------");
    }

    public void sportPlayer() {
        System.out.println("---------------------------------------");
        System.out.println("List of player who play Cricket :- ");
        list.stream().filter(player -> player.getSport() == "Cricket").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of player who play Basketball :- ");
        list.stream().filter(player -> player.getSport() == "Basketball").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of player who play Hockey :- ");
        list.stream().filter(player -> player.getSport() == "Hockey").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of player who play Kho Kho :- ");
        list.stream().filter(player -> player.getSport() == "Kho Kho").forEach(System.out::println);
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println(" ## Welcome to Players and Sports Details ##");
        Scanner sc = new Scanner(System.in);
        PlayerDetails sp = new PlayerDetails();
        int choice = 0;
        while (choice != 6) {
            System.out.println(" 1-Add Player\n 2-Search Player\n 3-Player Status\n 4-Player Sport\n 6-Exit\nPlease Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sp.addPlayer();
                    break;
                case 2:
                    sp.searchPlayer();
                    break;
                case 3:
                    sp.statusOfPlayer();
                    break;
                case 4:
                    sp.sportPlayer();
                    break;
                case 5:
                    break;
            }
        }

    }
}


