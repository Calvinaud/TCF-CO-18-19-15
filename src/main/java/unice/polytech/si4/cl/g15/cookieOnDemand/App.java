package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CoD instance = CoD.getInstance();
        instance.init();
        
        instance.command();
        instance.chooseShop(instance.getShop(0));
        instance.chooseDate(new Date());
        
        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<Recipe> menu = instance.getMenu();
        
        products.add(new Product(menu.get(0), 2));
        products.add(new Product(menu.get(3), 6));
        products.add(new Product(menu.get(4), 1));
        
        instance.chooseProduct(products);
        instance.pay();
        
    }
}
