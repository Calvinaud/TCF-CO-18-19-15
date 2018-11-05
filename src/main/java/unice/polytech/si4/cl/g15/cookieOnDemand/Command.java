package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

public class Command {

	private Customer customer;
	private Shop shop;
	private int id;
	private State state;
	private String date;
	Collection<Product> product;

	/**
	 * 
	 * @param product
	 */
	public void setProducts(Product[] product) {

	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		// TODO - implement Commande.setDate
		throw new UnsupportedOperationException();
	}

	public void complete() {

	}

	public float getPriceExclTaxes() {
		throw new UnsupportedOperationException();
	}

	public float getPriceInclTaxes() {
		throw new UnsupportedOperationException();
	}


	public enum State {
		;

		private int InProgress;
		private int Completed;
		private int Validated;
		private int Cancelled;

	}


	public void setShop(Shop shop) {
	}

}