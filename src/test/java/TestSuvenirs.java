import com.OOPstore.Suvenirs.Inventory;
import com.OOPstore.Suvenirs.Suvenir;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestSuvenirs {
    Inventory inventory1;
    Inventory inventory2;

    @Before
    public void init() throws Exception {
        inventory1 = new Inventory();
        inventory2 = new Inventory();

    }
    @After
    public void  finish() {
        inventory1 = null;

    }
    @Test
    public void test1(){
        inventory1.show_inventory();
        for (Suvenir suvenir : inventory1.inventery){
            assertEquals(true,suvenir.getPrice()>0);

        }
    }
    @Test
    public void test2(){
        int lenght = inventory1.inventery.size();
        inventory1.deleteSuvenir((int)(Math.random()* (inventory1.inventery.size())));
        assertEquals(true, inventory1.inventery.size() == lenght-1);
    }
    @Test
    public void test3(){
        Suvenir suvenir1 = inventory2.getSuvenir(3);
        inventory2.deleteSuvenir(2);
        Suvenir suvenir2 = inventory2.getSuvenir(2);
        assertEquals(false, suvenir1 == suvenir2);
    }
}
