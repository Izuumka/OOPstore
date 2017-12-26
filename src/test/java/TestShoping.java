import com.OOPstore.Shoping.Basket;
import com.OOPstore.Shoping.Customer;
import com.OOPstore.Shoping.Shop;
import com.OOPstore.Suvenirs.Inventory;
import com.OOPstore.Suvenirs.Suvenir;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestShoping {
    Inventory inventory;
    Basket basket;
    Shop shop;
    Customer customer;

    @Before
    public void init() throws Exception {
        inventory = new Inventory();
        basket = new Basket();
        shop = new Shop();
        customer = new Customer("Andrew", shop);
    }

    @After
    public void finish() {
        inventory = null;
        basket = null;
        shop = null;
        customer = null;

    }

    @Test
    public void testBasket() {
        Integer price = 0;
        for (Suvenir suvenir : inventory.inventery) {
            basket.addElement(suvenir);
            price += suvenir.getPrice();
        }
        assertEquals(false, basket.getOrder_list().isEmpty());
        assertEquals(true, basket.getOrder_list().size() == inventory.inventery.size());
        assertEquals(true, price == basket.getTotal_prise());

        basket.clear();

        assertEquals(true, basket.getOrder_list().size() == 0);
    }

    @Test
    public void testCustomerInShop() {
//        Scanner in = new Scanner(System.in);
        int choose = 1;

        shop.getBasket().addElement(shop.getSuvenir(choose));
        customer.setMoney(customer.getMoney() - shop.getSuvenir(choose).getPrice());
        System.out.println(customer.getMoney());
        System.out.println(100- basket.getTotal_prise());
        assertEquals(true, customer.getMoney() < 100);
        assertEquals(false, 100 -customer.getMoney() == basket.getTotal_prise());





    }
}