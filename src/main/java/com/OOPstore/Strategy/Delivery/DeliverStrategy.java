package com.OOPstore.Strategy.Delivery;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;

public interface DeliverStrategy {
    boolean deliver(ArrayList<Suvenir> order_list, Customer cus);
}
