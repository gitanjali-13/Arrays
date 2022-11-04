package com.crud.operation;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ProductShopping {
    ArrayList<ProductDetails> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO SHOPPING APP!!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("1.add product details :");
        System.out.println("2.Add product to cart");
        System.out.println("3.");
        System.out.println("Enter your choice.");
        int choice = sc.nextInt();

        while (true) {

            ProductShopping app = new ProductShopping();
            switch (choice) {
                case 1:
                    app.add();
                    break;
                case 2:
                    //app.cart();
                    break;
                default:
                    System.out.println("enter valid choice ");
            }
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = (sc.next());
        System.out.println("enter product price");
        float productPrize = (sc.nextInt());
        System.out.println("enter product code");
        int productCode = (sc.nextInt());
        System.out.println(list);


    }
}
