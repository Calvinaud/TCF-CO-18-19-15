package unice.polytech.si4.cl.g15.cookieOnDemand;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class CommandTest {
    Command command;
    Shop shop;
    Customer customer;
    Recipe recipe, recipe1;
    Product product, product1;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
        shop = new Shop("Olympe", 2, 118218, new LocalTime(), new LocalTime(), new Manager());;
        String[] topping = {"topping1", "topping2"};
        recipe = new Recipe("name", "dough", "flavour", "mixed", "cooking", (float) 2.98, topping);
        recipe1 = new Recipe("2", "dough", "flavour", "mixed", "cooking", (float) 3.99, topping);
        command = new Command(customer, shop);
        product = new Product(recipe, command, 3);
        product1 = new Product(recipe1, command, 1);
        shop.setTax(0.2f);

    }

    @Test
    public void setState() {
        command.setState(Command.State.InProgress);
        assertEquals(Command.State.InProgress, command.getState());
    }

    @Test
    public void getState() {
        assertEquals(Command.State.Paid, command.getState());
    }

    @Test
    public void getProducts() {
        ArrayList<Product> result = new ArrayList<Product>();
        assertEquals(result, command.getProducts());
    }

    @Test
    public void setProducts() {
        ArrayList<Product> result = new ArrayList<Product>();
        result.add(product);
        result.add(product1);
        Product[] p = {product,product1};
        command.setProducts(p);
        assertEquals(result, command.getProducts());
    }

    @Test
    public void setDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 1);
        assertFalse(command.setDate(c.getTime()));
        assertNull(command.getDate());
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 2);
        assertTrue(command.setDate(c.getTime()));
    }

    @Test
    public void getDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 2);
        Date d = c.getTime();
        command.setDate(d);
        assertEquals(d, command.getDate());
    }

    @Test
    public void complete() {
        command.complete();
        assertEquals(Command.State.Completed, command.getState());
    }

    @Test
    public void getPriceExclTaxes() {
        Product[] p = {product,product1};
        command.setProducts(p);
        assertEquals((float) 3*2.98 + 3.99, command.getPriceExclTaxes(), 0.001);
    }

    @Test
    public void getPriceInclTaxes() {
        Product[] p = {product,product1};
        command.setProducts(p);
        assertEquals((float) 1.2 * (3*2.98 + 3.99), command.getPriceInclTaxes(), 0.001);
    }
}