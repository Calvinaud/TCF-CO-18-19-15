package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

public class CoD {
	private static CoD instance;
	
	private ArrayList<Customer> customer;
	private ArrayList<Shop> shop;
	private ArrayList<Command> command;
	
	private Command currentCommand;

	/**
	 * Private constructor of the class
	 */
	private CoD() {
	}
	
	/**
	 * Point d'accée de l'instance CoD
	 * @return Instance of the CoD class
	 */
	public static CoD getInstance() {
		if(instance == null) {
			instance = new CoD();
		}
		return instance;
	}
	
	/**
	 * Initialisation de la commande
	 */
	public void command() {
		if(currentCommand != null) {
			currentCommand = new Command();
		}
	}

	/**
	 * Choix d'un magasin
	 * @param shop
	 */
	public void chooseShop(Shop shop) {
		if(currentCommand != null) {
			currentCommand.setShop(shop);
		}
	}

	/**
	 * Choix d'un procuit
	 * @param product
	 */
	public void chooseProduct(Product[] product) {
		if(currentCommand != null) {
			currentCommand.setProducts(product);
		}
	}

	/**
	 * Choix de la date
	 * @param date
	 */
	public void chooseDate(Date date) {
		if(currentCommand != null) {
			currentCommand.setDate(date);
		}
	}
	
	/**
	 * Finalisation de la commande
	 */
	public void pay() {
		if(currentCommand != null) {
			currentCommand.complete();
		}
	}

	/**
	 * Get a customer in the collection by it's id
	 * @param id
	 */
	public Customer getCustomerById(int id) {
		Customer result = null;
		int i = 0;
		while(i < customer.size() && result ==  null) {
			if(customer.get(i).getId() == id) {
				result = customer.get(i);
			}
			i++;
		}
		return result;
	}
	
	/**
	 * Get a shop in the collection by it's id
	 * @param id
	 */
	public Shop getShop(int id) {
		Shop result = null;
		int i = 0;
		while(i < shop.size() && result ==  null) {
			if(shop.get(i).getId() == id) {
				result = shop.get(i);
			}
			i++;
		}
		return result;
	}
	
	/**
	 * Get the current menu of cookie factory
	 * @return The collection of recipe currently on the menu
	 */
	public ArrayList<Recipe> getMenu() {
		return null;
	}

	/**
	 * Get all the command
	 * @return The collection of all the commands
	 */
	public ArrayList<Command> getCommand() {
		return command;
	}
}