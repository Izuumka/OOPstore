package com.OOPstore.Shoping;

import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;
import java.util.Scanner;

public class Castomer {
    private int many = 100;
    public String name;
    public ArrayList<Suvenir> bag;
    public Shop shop;

    public Castomer(String name,Shop shop){
        this.shop = shop;
        this.name = name;
    }
    public void shoping(){
        Scanner in = new Scanner(System.in);
        int choose = 10;
        while (choose!= 0){
            int lenght = see_list();
            if(lenght == 0){
                System.out.println("Sorry we are closed)))");
                break;
            }
            System.out.println("My many -> "+ this.many);
            System.out.println("Choose -> ");
            System.out.println("Press 0 to exit---------------");
            choose = in.nextInt();
            if (choose == 0) break;
            else if(0 < choose && choose < 7) buy(choose);
            else break;

        }
        System.out.println("THANKS YOU FOR SHOPING");
    }
    public int see_list(){
        return this.shop.show();
    }
    public void buy(int id){
        this.many -= this.shop.price(id);
        this.shop.setMany(this.shop.price(id));
        this.shop.give(id);
    }
}
