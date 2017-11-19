package com.OOPstore.Main;

import com.OOPstore.Shoping.Castomer;
import com.OOPstore.Shoping.Shop;
import com.OOPstore.Suvenirs.*;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Castomer vasa = new Castomer("Andrew", shop);
        vasa.shoping();
    }
}

