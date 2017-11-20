package com.OOPstore.Shoping;

import com.OOPstore.Strategy.Pay.Cash;
import com.OOPstore.Strategy.Pay.PaymentStrategy;
import com.OOPstore.Strategy.Pay.Privat24;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private PaymentStrategy payment;
    private int money = 100;
    private String name;
    private ArrayList<Suvenir> bag;
    private Shop shop;

    public Customer(String name, Shop shop){
        this.bag = new ArrayList<>();
        this.shop = shop;
        this.name = name;
    }

    public int see_list(){
        return this.shop.show();
    }

    public boolean buy(int price,Shop shop, Customer customer){
        Scanner in = new Scanner(System.in);
        System.out.println("You want buy suvenirs by:\n" +
                "1: Chash\n" +
                "2: Online");

        int choose = in.nextInt();

        switch (choose){
            case 1:
                payment = new Cash();
                break;
            case 2:
                payment = new Privat24();
                break;
        }
        if(payment.pay(price, customer, shop)) return true;
        else return false;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Suvenir> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Suvenir> bag) {
        this.bag = bag;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
