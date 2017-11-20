package com.OOPstore.Shoping;

import com.OOPstore.Suvenirs.Suvenir;

import java.util.ArrayList;

public class Basket {
    protected ArrayList<Suvenir> order_list = new ArrayList<>();
    protected float total_prise;

    public void addElement(Suvenir suvenir){
        order_list.add(suvenir);
        computPrice();
    }
    protected void computPrice(){
        this.total_prise = 0;
        for (int i = 0; i < this.order_list.size() ; i++) {
            this.total_prise += this.order_list.get(i).getPrice();
        }
    }
    public void clear(){
        this.order_list.clear();
    }

    public ArrayList<Suvenir> getOrder_list() {
        return order_list;
    }


    public float getTotal_prise() {
        return total_prise;
    }


}
