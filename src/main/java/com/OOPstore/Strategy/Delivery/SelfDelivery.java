package com.OOPstore.Strategy.Delivery;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;

public class SelfDelivery implements DeliverStrategy {
    @Override
    public boolean deliver(ArrayList<Suvenir> order_list, Customer customer) {
        System.out.println("Good Luck");
        customer.setBag(order_list);
        return true;

    }
}
