package com.OOPstore.Strategy.Pay;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Shoping.Shop;

import java.util.Objects;
import java.util.Scanner;

public class Privat24 implements PaymentStrategy{
    Customer customer;
    @Override
    public boolean pay(int price, Customer customer, Shop shop) {
        this.customer = customer;

        if(logIn() && !((customer.getMoney() - price) < 0)){
            customer.setMoney(customer.getMoney() - price);
            shop.setMany(price);
            return true;
        }
        else return false;

    }
    private boolean logIn(){
        String number, password;
        String name = customer.getName();

        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.println("");
        System.out.println("-----------------Privat Bank 24-------------------");
        System.out.println("To pay you need login into system");
        System.out.println("Enter yor number : ");

        number = in.nextLine();

        System.out.println("");
        System.out.println("");
        System.out.println("-----------------Privat Bank 24-------------------");
        System.out.println("Enter yor password : ");

        password = in.nextLine();

        System.out.println("");
        System.out.println("");
        System.out.println("-----------------Privat Bank 24-------------------");
//        System.out.println("Hello " + name + " your limit is: " + customer.getMoney() );

        String choose;

        do {
            System.out.println("Doy you want to use your online money: Y/N");
            choose = in.nextLine();

            if (choose.equals("Y")|| choose.equals("y")) return true;
            else System.out.println("Incorrect data!!!!!! One more time");

        }while (!choose.equals("N") || !choose.equals("n"));
        return false;

    }
}
