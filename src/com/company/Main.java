package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Phone phone = new Phone("Iphone", "Black", 5.0);
        Laptop laptop = new Laptop("Asus", "red", 2.4, "CND82RV");

        System.out.println(phone.toString());
        //overloading toString
        System.out.println(phone.toString(phone.getBrand(), phone.getColor()));
        //overloading toString
        System.out.println(laptop.toString(laptop.getBrand(), laptop.getColor(), true));

        laptop.exportFile("laptop.txt");
        phone.exportFile("telefon.txt");

    }
}
