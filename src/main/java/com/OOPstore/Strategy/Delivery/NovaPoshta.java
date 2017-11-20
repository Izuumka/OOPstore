package com.OOPstore.Strategy.Delivery;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;

public class NovaPoshta implements DeliverStrategy{

    @Override
    public boolean deliver(ArrayList<Suvenir> order_list, Customer customer) {
        if(customer.getMoney() - 8 <= 0) {
            System.out.println("I have note enough money");
            new SelfDelivery().deliver(order_list, customer);

        }
        else {
            System.out.println("Нова Пошта - Завжди з тобою))");
            customer.setBag(order_list);
        }
        return true;
    }
}
