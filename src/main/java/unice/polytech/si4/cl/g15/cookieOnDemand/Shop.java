package unice.polytech.si4.cl.g15.cookieOnDemand;

import org.joda.time.LocalTime;

import java.util.*;

public class Shop {

	private Recipe monthlyRecipe;
	private List<Manager> manager;
	private float tax;
	private LocalTime openTime;
	private LocalTime closeTime;
	private String address;
	private int phone;
	private List<Command> commands;

	public Shop(String adress, float tax, int phone, LocalTime openTime, LocalTime closeTime, Manager... manager){
		this.address = adress;
	    this.tax = tax;
		this.phone = phone;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.commands = new ArrayList<Command>();
        this.manager = new ArrayList<Manager>();
        this.manager.addAll(Arrays.asList(manager));
	}

	public void changeMonthlyRecipe(String name, String dough, String flavour, String mixed, String cooking, float price, String... topping){
        monthlyRecipe = new Recipe(name, dough, flavour, mixed, cooking, price, topping);
    }

	public Recipe getMonthlyRecipe() {
		return monthlyRecipe;
	}

	public List<Command> getCommand() {
		return commands;
	}

	public void setTax(float tax){
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

}