package unice.polytech.si4.cl.g15.cookieOnDemand;

import java.util.*;

public class Customer {

	private Collection<Command> command;
	private int id;
	private String firstName;
	private String lastName;
	private int phone;
	private boolean hasAcceptedLoyaltyProgram;
	private int cumulateRecipes;

	/**
	 * 
	 * @param hasAccepted
	 */
	public void setAcceptedLoyaltyProgram(boolean hasAccepted) {

	}

	public Command[] getCommand() {
		throw new UnsupportedOperationException();
	}

}