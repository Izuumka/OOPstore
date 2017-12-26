import com.OOPstore.Suvenirs.Inventory;
import com.OOPstore.Suvenirs.Suvenir;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestSuvenirs {
    Inventory inventory;

    @Before
    public void init() throws Exception {
        inventory = new Inventory();

    }
    @After
    public void  finish() {
        inventory = null;

    }
    @Test
    public void test1(){
        inventory.show_inventory();
        for (Suvenir suvenir : inventory.inventery){
            assertEquals(true,suvenir.getPrice()>5);

        }
    }
    @Test
    public void test2(){
        int lenght = inventory.inventery.size();
        inventory.deleteSuvenir((int)(Math.random()* (inventory.inventery.size())));
        assertEquals(true, inventory.inventery.size() == lenght-1);
    }
//    @Test
//    public void test3(){
//        for (int i = 0; i < inventory.inventery.size();) {
//            inventory.deleteSuvenir(i);
//
//        }
//        assertEquals(true,inventory.inventery.size() == 0);
//
//    }


}
