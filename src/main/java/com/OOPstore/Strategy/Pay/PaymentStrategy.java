package com.OOPstore.Strategy.Pay;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Shoping.Shop;

public interface PaymentStrategy {
    boolean pay(int price, Customer customer, Shop shop);
}
