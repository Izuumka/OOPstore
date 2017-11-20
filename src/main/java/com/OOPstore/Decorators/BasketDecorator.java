package com.OOPstore.Decorators;

import com.OOPstore.Shoping.Basket;
import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;

public class BasketDecorator extends Basket {
    Basket wrepee;


    public BasketDecorator(Basket basket){
        this.wrepee = basket;
    }

    @Override
    public void addElement(Suvenir suvenir) {
        super.addElement(suvenir);
    }

    @Override
    protected void computPrice() {
        super.computPrice();
    }

    @Override
    public ArrayList<Suvenir> getOrder_list() {
        return super.getOrder_list();
    }

    @Override
    public float getTotal_prise() {
        return super.getTotal_prise();
    }
}
