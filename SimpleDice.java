package p5;

import java.util.Random;

/**
 * Klassen SimpleDice representerar en t�rning med minst en sida
 * version 1.0
 * @author Bojan Radosavljevic
 *
 */

public class SimpleDice implements Dice{
	private int sides;
	/**
	 * Konstruktorn s�tter t�rningen till sex-sidig
	 */
	public SimpleDice() {
		this.sides = 6;
	}
	/**
	 * Konstruktorn tar emot t�rningens sidor
	 * @param sides
	 * @exception NegativeSidesException om input �r lika med noll eller negativt tal
	 */
	public SimpleDice( int sides ) {
		this.sides = sides;
		if(this.sides <=0) {
			throw new NegativeSidesException("T�rningen m�ste ha minst en sida:" + sides);
		}
	}
	
	/**
	 * Metoden kastar t�rningen 100000ggr
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
	 * Metoden returnerar t�rningens sidor
	 * @return sides
	 */
	public int getSides() {
		return sides;
	}
}
