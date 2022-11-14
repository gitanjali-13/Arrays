package com.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoFileRead {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Manoj\\OneDrive\\Desktop\\name.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
