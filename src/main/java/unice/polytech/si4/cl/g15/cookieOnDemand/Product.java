package unice.polytech.si4.cl.g15.cookieOnDemand;

public class Product {

	private int number;
	private Command command;
	private Recipe recipe;

	public Product(Recipe r, Command c, int n){
		number = n;
		command =c;
		recipe = r;
	}

	/**
	 * for Command to calculate the price
	 * @return total price of the product
	 */
	public float getPrice(){
		return number * recipe.getPrice();
	}

}