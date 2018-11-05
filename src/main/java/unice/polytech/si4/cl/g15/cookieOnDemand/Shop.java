package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.time.LocalTime;
import java.util.*;

public class Shop {
	private int id;
	private Recipe monthlyRecipe;
	private List<Manager> manager;
	private float tax;
	private LocalTime openTime;
	private LocalTime closeTime;
	private String address;
	private String phone;
	private List<Command> commands;

	public Shop(int id, String adress, float tax, String phone, LocalTime openTime, LocalTime closeTime, Manager... manager){
		this.id = id;
		this.address = adress;
	    this.tax = tax;
		this.phone = phone;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.commands = new ArrayList<Command>();
        this.manager = new ArrayList<Manager>();
        this.manager.addAll(Arrays.asList(manager));
	}

	/**
	 * Modify the special Monthly Recipe of this shop
	 * @param name the name of Recipe
	 * @param dough the type of dough
	 * @param flavour the flavour
	 * @param mixed the type of mixed
	 * @param cooking the type of cooking
	 * @param price the price of the Recipe
	 * @param topping the list of toping of the Recipe
	 */
	public void changeMonthlyRecipe(String name, String dough, String flavour, String mixed, String cooking, float price, String... topping){
        monthlyRecipe = new Recipe(name, dough, flavour, mixed, cooking, price, topping);
    }

	/**
	 * Get the special Monthly Recipe of this shop
	 * @return  the Monthly Recipe
	 */
	public Recipe getMonthlyRecipe() {
		return monthlyRecipe;
	}

	/**
	 * Get the list of command of this shop
	 * @return the list
	 */
	public List<Command> getCommand() {
		return commands;
	}

	/**
	 * Modify the tax rate
	 * @param tax the new tax rate
	 */
	public void setTax(float tax){
		this.tax = tax;
	}

	/**
	 * Get the tax rate
	 * @return the tax rate
	 */
	public float getTax() {
		return tax;
	}

	public int getId() {
		return id;
	}

}