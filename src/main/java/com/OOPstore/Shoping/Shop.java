package com.OOPstore.Shoping;

import com.OOPstore.Suvenirs.Inventory;
import com.OOPstore.Suvenirs.Suvenir;

public class Shop {
    private int many = 0;
    private Inventory inventory = new Inventory();



    public int show(){
        this.inventory.show_inventory();
        return this.inventory.inventery.size();
    }
    public Suvenir give(int id){
        Suvenir suvenir = this.inventory.inventery.get(id -1);
        this.inventory.inventery.remove(suvenir);
        return suvenir;

    }
    public int price(int id){
        return this.inventory.inventery.get(id - 1).getPrice();
    }

    public void setMany(int many) {
        this.many = this.many + many;
    }
}
