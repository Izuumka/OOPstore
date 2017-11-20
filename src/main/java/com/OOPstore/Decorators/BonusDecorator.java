package com.OOPstore.Decorators;

import com.OOPstore.Shoping.Basket;
import com.OOPstore.Suvenirs.Suvenir;

public class BonusDecorator extends BasketDecorator {

    public BonusDecorator(Basket basket){
        super(basket);
    }
    @Override
    public void addElement(Suvenir suvenir){
        suvenir.setName(suvenir.getName() + "@Izumka");
        order_list.add(suvenir);
        super.computPrice();
    }

}
