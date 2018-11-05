package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Command {

	private Customer customer;
	private Shop shop;
	private static AtomicInteger uniqueId = new AtomicInteger();
	private int id;
	private State state;
	private Date date;
	ArrayList<Product> product = new ArrayList<Product>();

	public Command(){
		id = uniqueId.incrementAndGet();
		state = State.Paid;
	}

	public Command(Customer c, Shop b){
		customer = c;
		shop = b;
		id = uniqueId.incrementAndGet();
		state = State.Paid;
	}


	/**
	 * To change the command's state
	 * @param state
	 */
	public void setState(State state){
		this.state = state;
	}

	/**
	 *
	 * @return the current command's state
	 */
	public State getState(){
		return state;
	}

	public ArrayList<Product> getProducts() {
		return product;
	}

	/**
	 * customer chooses products
	 * @param product
	 */
	public void setProducts(Product[] product) {
		for (int i = 0; i < product.length; i++){
			this.product.add(product[i]);
		}
	}

	/**
	 * customer chooses date(at least 2 hours from now) to collect cookies
	 * @param date
	 */
	public boolean setDate(Date date) {
		Date now = new Date();
		if (date.getTime() - now.getTime() > 7199000){
			this.date = date;
			return true;
		}else{
			System.out.println("The time has to be at least 2 hours from now.");
			return false;
		}

	}

	/**
	 *
	 * @return time the customer's chosen
	 */
	public Date getDate(){
		return this.date;
	}

	/**
	 * the staff confirm the delivery
	 */
	public void complete() {
		this.state = State.Completed;
	}

	/**
	 *
	 * @return total price excluding taxes of the command
	 */
	public float getPriceExclTaxes() {
		float total = 0;
		Iterator<Product> it = product.iterator();
		while(it.hasNext()){
			total += it.next().getPrice();
		}
		return total;
	}

	/**
	 *
	 * @return total price including taxes of the command
	 */
	public float getPriceInclTaxes() {
		return getPriceExclTaxes() * ( 1 + shop.getTax() );
	}


	public enum State {

		Paid, InProgress, Completed, Validated, Cancelled;

	}


	public void setShop(Shop shop) {
	}

}