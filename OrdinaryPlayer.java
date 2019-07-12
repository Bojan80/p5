package p5;

/**
 * Klassen OrdinaryPlayer representerar en spelare och �rver den abstrakta klassen Player
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
 	 * Initialiserar spelaren med ett namn och t�rningen med en t�rning	
 	 * @param name
 	 * @param dice
 	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}
	/**
 	 * Metoden initialiserar t�rningen
 	 * @param dice
 	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	/**
	 * Objektet Dice h�mtas returneras
	 * @return dice
	 */
	public Dice getDice() {
		return dice;
	}
	/**
	 * Metoden returnerar metoden throwDice fr�n klassen SimpleDice
	 * @return dice.throwDice
	 */
	public int throwDice() {
		return dice.throwDice();
	}
}
