package p5;

import java.util.Random;

/**
 * Klassen Cheater representerar en spelare som fuskar
 * version 1.0
 * @author Bojan Radosavljevic
 *
 */

public class Cheater extends Player{
	private Dice dice;
    /**
     * Metoden ger fuskaren ett namn och tärningen ges 6 sidor
     * @param name
     */
	public Cheater(String name) {
        super(name);
        dice = new SimpleDice(6);
    }
	/**
	 * Namn och tärning initialiseras
	 * @param name
	 * @param dice
	 */
    public Cheater(String name, Dice dice) {
        super(name);
        this.dice = dice;
    }
    /**
     * Metoden sätter tärning till tärning
     * @param dice
     */
    public void setDice(Dice dice) {
        this.dice = dice;
    }	
    /**
     * Tärningens sidor returneras
     * @return this.dice
     */
    public Dice getDice() {
        return this.dice;
    }
    /**
     * Metoden kastar tärningen. I ca hälften av kasten sker fusk men om 
     *  tärningen visar max antal prickar så låter Cheatern bli att fuska. 
     *  @return dots
     */
    public int throwDice() {
    	Random rand = new Random();
    	int dots = dice.throwDice(); // sätt metoden i en variabel för att kunna använda den som räknare
    	
    	if(rand.nextInt(2) == 1) { // fuskning sker i ca hälften av fallen
            return dice.throwDice();
        }
        else if(dots < dice.getSides()) {
                dots++;
        }
    	return dots;
    }
}
