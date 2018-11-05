package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

public class Recipe {
	private String name;
	private String dough;
	private String flavour;
	private String mixed;
	private String cooking;
	private float price;
	private String[] topping;
	ArrayList<Product> product;

	public Recipe(String name, String dough, String flavour, String mixed, String cooking, float price, String... topping){
		this.name = name;
		this.dough = dough;
		this.flavour = flavour;
		this.mixed = mixed;
		this.cooking = cooking;
		this.price = price;
		this.topping = topping;
	}

	/**
	 * Return the price without taxes of the recipe
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

}