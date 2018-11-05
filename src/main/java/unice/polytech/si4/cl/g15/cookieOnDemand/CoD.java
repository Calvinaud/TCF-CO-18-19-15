package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

import org.joda.time.LocalTime;

public class CoD {
	private static CoD instance;
	
	private ArrayList<Customer> customer;
	private ArrayList<Shop> shop;
	private ArrayList<Command> command;
	private ArrayList<Recipe> recipe;
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
	 * Classe d'initialisation intégrant des données de test
	 */
	public void init() {
		this.shop = new ArrayList<Shop>();
		this.recipe = new ArrayList<Recipe>();
		
		Shop shop = new Shop(0, "12 rue des lucioles", 20, "0123456789", LocalTime.MIDNIGHT, LocalTime.MIDNIGHT, new Manager());
		shop.changeMonthlyRecipe("Special", "X", "X", "X", "X", 2, "X");
		
		this.shop.add(shop);
		
		this.recipe.add(new Recipe("Recipe 1", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 2", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 3", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 4", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 5", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 6", "X", "X", "X", "X", 2, "X"));
		this.recipe.add(new Recipe("Recipe 7", "X", "X", "X", "X", 2, "X"));
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
	public void chooseProduct(ArrayList<Product> product) {
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
		return this.recipe;
	}

	/**
	 * Get all the command
	 * @return The collection of all the commands
	 */
	public ArrayList<Command> getCommand() {
		return command;
	}
}