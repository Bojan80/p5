package p5;

/**
 * Klassen OrdinaryPlayer representerar en spelare och ärver den abstrakta klassen Player
 * version 1.0
 * @author Bojan Radosavljevic
 *
 */

public class OrdinaryPlayer extends Player{
	private Dice dice;
    /**
	 * Konstruktorn ger spelaren ett namn	
	 * @param name
	 */
	public OrdinaryPlayer(String name) {
		super(name);
	}
    /**
 	 * Initialiserar spelaren med ett namn och tärningen med en tärning	
 	 * @param name
 	 * @param dice
 	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}
	/**
 	 * Metoden initialiserar tärningen
 	 * @param dice
 	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	/**
	 * Objektet Dice hämtas returneras
	 * @return dice
	 */
	public Dice getDice() {
		return dice;
	}
	/**
	 * Metoden returnerar metoden throwDice från klassen SimpleDice
	 * @return dice.throwDice
	 */
	public int throwDice() {
		return dice.throwDice();
	}
}
