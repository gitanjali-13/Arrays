package com.sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class SportsApp {
    String name;
    String sports;
    String status;
    public SportsApp(String name, String sports, String status) {
        this.name = name;
        this.sports = sports;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
public class Search {
    public static void main(String[] args) {
        List<SportsApp> personDetails = new ArrayList<>();
        personDetails.add(new SportsApp("Sachin tendulkar","Cricket","Retired"));
        personDetails.add(new SportsApp("M.S.Dhoni","Cricket","Retired"));
        personDetails.add(new SportsApp("Virat kohali","Cricket","Active"));
        personDetails.add(new SportsApp("Rohit sharma","Cricket","Active"));
        personDetails.add(new SportsApp("Cristeano Ronaldo","Football","Active"));
        personDetails.add(new SportsApp("Leono Messy","Football","Active"));
        personDetails.add(new SportsApp("Mithali raj","Cricket","Active"));
        Iterator itr = personDetails.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        List<SportsApp> list =personDetails.stream().filter(p -> p.name == p.name).collect(Collectors.toList());
//        System.out.println(list);

    }
}