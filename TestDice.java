package p5;

public class TestDice {
	public static void test( Dice dice, int nbrOfThrows){
		int[] res = new int[dice.getSides()]; //  lagra en räknare för varje antal prickar som kan inträffa
		int i = 0, j = 0;
		
		while(i < nbrOfThrows ) {
			res[dice.throwDice() - 1]++; // kastar tärningen och ökar värdet i arrayn med ++
			i++;
		}
		while(j < dice.getSides()) {
			TextWindow.println((j+1) + "\t" + res[j]);
			j++;
		}
		TextWindow.println();						
	}
	
	public static void test(Player player, int nbrOfThrows) {
		int diceSides, i = 0, j = 0;
			
		if(player instanceof Cheater) {
			Cheater cheater = (Cheater) player;
			diceSides = cheater.getDice().getSides();
		}
		else {
			OrdinaryPlayer ordPlayer = (OrdinaryPlayer) player;
			diceSides = ordPlayer.getDice().getSides(); 
		}
		int [] res = new int[diceSides];
		while(i < nbrOfThrows) {
			res[player.throwDice() - 1]++;
			i++;
		}
		while(j < diceSides) {
			TextWindow.println((j+1) + "\t" + res[j]); // lägg till en tabb mellan tärningssidan och antal 
			j++;
		}
	}

	public static void main(String[] args) {
		TestDice.test( new SimpleDice( 6 ), 1000000 ); 
		TextWindow.println(); 
		TestDice.test( new SimpleDice( 4 ), 1000000 ); 
//		TestDice.test( new OrdinaryPlayer( "Rut", new SimpleDice( 6 ) ), 1000000 ); 
//		TextWindow.println(); 
//		TestDice.test( new Cheater( "Fuffe", new SimpleDice( 6 ) ), 1000000 ); 
		
	}
}