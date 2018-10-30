package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

public class Shop {

	private Recipe recipe;
	private Collection<Manager> manager;
	private float tax;
	private Date businessHours;
	private String address;
	private int phone;

	public Recipe getMonthlyRecipe() {
		throw new UnsupportedOperationException();
	}

	public Command[] getCommand() {
		throw new UnsupportedOperationException();
	}

	public void setTax(float tax){
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

}