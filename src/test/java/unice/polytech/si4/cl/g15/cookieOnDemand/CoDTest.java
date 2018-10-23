package unice.polytech.si4.cl.g15.cookieOnDemand;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CoDTest {

    Recipe recipe;
    float price;

    @Before
    public void setUp(){
        price = 300;
        String[] topping = {"MM","Chocolate"};
        recipe = new Recipe("Magical Cookie", "Chocolate", "Vanilla", "Mixed", "Chewy", price, topping);
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(price,recipe.getPrice());
    }

}