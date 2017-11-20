package com.OOPstore.Decorators;

import com.OOPstore.Shoping.Basket;

public class DiscountDecorator extends BasketDecorator {


    public DiscountDecorator(Basket basket){
        super(basket);
    }

    @Override
    protected void computPrice() {
        this.total_prise = 0;
        for (int i = 0; i < this.order_list.size() ; i++) {
            this.total_prise += this.order_list.get(i).getPrice();
        }
        this.total_prise -= (this.total_prise / 10);
    }
}

