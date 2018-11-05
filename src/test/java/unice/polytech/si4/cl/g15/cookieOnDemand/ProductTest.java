package unice.polytech.si4.cl.g15.cookieOnDemand;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    Customer customer;
    Shop s;
    Recipe r;
    Command c;
    Product p;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
        s = new Shop("Olympe", 2, 118218, new LocalTime(), new LocalTime(), new Manager());
        String[] topping = {"topping1", "topping2"};
        r = new Recipe("name", "dough", "flavour", "mixed", "cooking", (float) 2.99, topping);
        c = new Command(customer, s);
        p = new Product(r, c, 2);
    }

    @Test
    public void getPrice() {
        assertEquals((float) 2.99*2, p.getPrice(),0);
    }
}