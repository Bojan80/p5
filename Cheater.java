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
     * Metoden ger fuskaren ett namn och t�rningen ges 6 sidor
     * @param name
     */
	public Cheater(String name) {
        super(name);
        dice = new SimpleDice(6);
    }
	/**
	 * Namn och t�rning initialiseras
	 * @param name
	 * @param dice
	 */
    public Cheater(String name, Dice dice) {
        super(name);
        this.dice = dice;
    }
    /**
     * Metoden s�tter t�rning till t�rning
     * @param dice
     */
    public void setDice(Dice dice) {
        this.dice = dice;
    }	
    /**
     * T�rningens sidor returneras
     * @return this.dice
     */
    public Dice getDice() {
        return this.dice;
    }
    /**
     * Metoden kastar t�rningen. I ca h�lften av kasten sker fusk men om 
     *  t�rningen visar max antal prickar s� l�ter Cheatern bli att fuska. 
     *  @return dots
     */
    public int throwDice() {
    	Random rand = new Random();
    	int dots = dice.throwDice(); // s�tt metoden i en variabel f�r att kunna anv�nda den som r�knare
    	
    	if(rand.nextInt(2) == 1) { // fuskning sker i ca h�lften av fallen
            return dice.throwDice();
        }
        else if(dots < dice.getSides()) {
                dots++;
        }
    	return dots;
    }
}
