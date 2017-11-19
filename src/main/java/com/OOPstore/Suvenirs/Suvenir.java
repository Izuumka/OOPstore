package com.OOPstore.Suvenirs;

public abstract class Suvenir {
    int number, price;
    String name, type;


    public Suvenir(int number,String name, int price, String type) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
