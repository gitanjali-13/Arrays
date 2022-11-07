package com.workshop1.practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Gitanjali");
        queue.add("Deshmukh");
        queue.add("Gujarat");
        queue.add("Engineer");
        System.out.println("head = " +queue.element());
        System.out.println("head = " +queue.peek());

        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println();
        System.out.println("AFTER REMOVING ELEMENTS");
        Iterator itr1 = queue.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
