package com.OOPstore.Suvenirs;

public abstract class Cup extends Suvenir{
    public float capacity;
    public String color;
    public Cup(int number,String name, int price, String type, float capacity, String color) {
        super(number, name, price, type);
        this.capacity = capacity;
        this.color = color;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
