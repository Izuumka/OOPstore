package com.OOPstore.Strategy.Pay;

import com.OOPstore.Shoping.Customer;
import com.OOPstore.Shoping.Shop;

public class Cash implements PaymentStrategy{
    @Override
    public boolean pay(int price, Customer customer, Shop shop) {

        if(customer.getMoney() - price < 0) return false;

        customer.setMoney(customer.getMoney() - price);
        shop.setMany(price);
        return true;
    }
}
