package com.OOPstore.Suvenirs;

public class Bottle extends Suvenir {
    public float capasity;
    public String color;

    public Bottle(int number,String name, int price, String type, float capasity, String color) {
        super(number, name, price, type);
        this.capasity = capasity;
        this.color = color;
    }

    public float getCapasity() {
        return capasity;
    }

    public void setCapasity(float capasity) {
        this.capasity = capasity;
    }
}
