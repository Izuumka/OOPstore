package com.OOPstore.Shoping;

import com.OOPstore.Strategy.Delivery.DeliverStrategy;
import com.OOPstore.Strategy.Delivery.NovaPoshta;
import com.OOPstore.Strategy.Delivery.SelfDelivery;
import com.OOPstore.Suvenirs.Inventory;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private int many = 0;
    private Inventory inventory = new Inventory();
    private DeliverStrategy deliver;
    private Basket basket = new Basket();



    public int show(){
        this.inventory.show_inventory();
        return this.inventory.inventery.size();
    }
    public Suvenir getSuvenir(int id){

        Suvenir suvenir = this.inventory.inventery.get(id -1);
        System.out.println(suvenir.getName());
        return suvenir;

    }
    private void dellEll(int id){
        this.inventory.deleteSuvenir(id - 1);
    }
    public boolean delivery(ArrayList<Suvenir> suvenirs, Customer customer){
        System.out.println("DO you need delivery?? Y/N");
        Scanner in = new Scanner(System.in);
        String choose = in.nextLine();
        switch (choose){
            case "Y":
                deliver = new NovaPoshta();
                break;
            default:
                deliver = new SelfDelivery();
                break;
        }
        deliver.deliver(suvenirs, customer);
        return true;
    }
    public void finish_sell(){
        this.basket.clear();
    }
    public Basket getBasket() {
        return basket;
    }

    public int price(int id){
        return this.inventory.inventery.get(id - 1).getPrice();
    }

    public void setMany(int many) { this.many = this.many + many; }

    public Inventory getInventory() {
        return inventory;
    }
}
