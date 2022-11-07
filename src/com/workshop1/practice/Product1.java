package com.workshop1.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product1 {
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

class JavaStreamDemo {
    public static void main(String[] args) {
        List<Product1> productlist = new ArrayList<>();
        productlist.add(new Product1(1, "Hp", 30000f));
        productlist.add(new Product1(1, "lenovo", 40000f));
        productlist.add(new Product1(1, "acer", 50000f));
        productlist.add(new Product1(1, "Dell", 10000f));
        //stream API
        List<Float> pricelist2 = productlist.stream().filter(p -> p.price > 40000f).map(p -> p.price).collect(Collectors.toList());
        System.out.println(pricelist2);


    }
}
