import java.security.SecureRandom;

//Create class simulates the dice game craps
public class Craps {
	
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// enum type with constants that represent the game status
	private enum Status {CONTINUE, WON, LOST};
	
	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int  BOX_CARS = 12;

}
