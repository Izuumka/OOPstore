package com.OOPstore;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Shoping.Shop;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Customer vasa = new Customer("Andrew", shop);
        shoping(vasa, shop);

    }

    public static void shoping(Customer customer, Shop shop) {

        Scanner in = new Scanner(System.in);
        int choose;

        int next;

        while (true) {
            customer.see_list();

            System.out.println("My many -> " + customer.getMoney());
            System.out.println("Choose -> ");
            System.out.println("Press 0 to exit or 100 to buy---------------");
            choose = in.nextInt();


            if (choose == 0) {
                next = 0;
                break;
            } else if (choose == 100) {
                next = 1;
                break;
            } else if (0 < choose && choose <= shop.getInventory().inventery.size()) {
                shop.getBasket().addElement(shop.getSuvenir(choose));
                customer.setMoney(customer.getMoney() - shop.getSuvenir(choose).getPrice());
            } else {
                System.out.println("");
                System.out.println("There are np such suvenir, choose another");
                System.out.println("");
            }

        }
        switch (next) {
            case 0:
                break;
            case 1:
                if (customer.buy((int) shop.getBasket().getTotal_prise(), shop, customer)) {
                    ArrayList<Suvenir> sels = shop.getBasket().getOrder_list();
                    shop.finish_sell();

                    System.out.println("do you need delivery ????Y/N");
                    shop.delivery(sels, customer);
                }
                break;
        }
        System.out.println("THANKS YOU FOR SHOPING");

    }


}




