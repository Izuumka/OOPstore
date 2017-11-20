package com.OOPstore.Suvenirs;

import java.util.ArrayList;


public class Inventory {
    public ArrayList<Suvenir>  inventery = new ArrayList<>();

    public Inventory(){
        for (int i = 0; i < 6 ; i++) {
            addSuvenir(CreatFactory.create(i));
        }

    }
    public void show_inventory(){
        System.out.println("----------------Izumka STORE-----------------");
        System.out.println("Inventory that you can buy in our store: ");
        for (int i = 0; i < this.inventery.size() ; i++) {
            System.out.println("№"+ (i+ 1)+ "[Name: " + inventery.get(i).name+" Price: "+ inventery.get(i).price +"] ");

        }
    }

    public ArrayList<Suvenir> addSuvenir(Suvenir suvenir){
        this.inventery.add(suvenir);
        return this.inventery;
    }
    public ArrayList<Suvenir> deleteSuvenir(int id){
        this.inventery.remove(getSuvenir(id));
        return this.inventery;
    }

    public Suvenir getSuvenir(int id){
        for (int i = 0; i < this.inventery.size(); i++) {
            if (this.inventery.get(i).getNumber() == id) return this.inventery.get(i);
        }
        return null;
    }

}
