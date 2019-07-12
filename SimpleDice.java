package p5;

import java.util.Random;

/**
 * Klassen SimpleDice representerar en tärning med minst en sida
 * version 1.0
 * @author Bojan Radosavljevic
 *
 */

public class SimpleDice implements Dice{
	private int sides;
	/**
	 * Konstruktorn sätter tärningen till sex-sidig
	 */
	public SimpleDice() {
		this.sides = 6;
	}
	/**
	 * Konstruktorn tar emot tärningens sidor
	 * @param sides
	 * @exception NegativeSidesException om input är lika med noll eller negativt tal
	 */
	public SimpleDice( int sides ) {
		this.sides = sides;
		if(this.sides <=0) {
			throw new NegativeSidesException("Tärningen måste ha minst en sida:" + sides);
		}
	}
	
	/**
	 * Metoden kastar tärningen 100000ggr
	 * @return dots		
	 */
	public int throwDice() {
		Random rand = new Random();
		int dots;
		dots = rand.nextInt(100000);
		dots = (dots + 1) % sides; 
        return dots + 1;
	}
	/**
	 * Metoden returnerar tärningens sidor
	 * @return sides
	 */
	public int getSides() {
		return sides;
	}
}
