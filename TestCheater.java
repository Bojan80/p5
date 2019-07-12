package p5;

public class TestCheater {
    public static void roll( Player player, int nbrOfThrows ) {
        // Typkonvertera referensen till "Referens till Cheater"
        Cheater ch = ( Cheater )player;
        // Använda Cheater-referensen för att erhålla spelarens Dice-objekt
        // Här går det inte att använda Player-referensen (player) eftersom metoden 
        // getDice() inte är deklarerad i klassen Player (eller i Object).
        Dice dice = ch.getDice();
        int sides = dice.getSides(), aThrow;
        // Skapa en array för att räkna antalet 1:or, 2:or ocv som tärningen visar vid kasten nedan 
        int[] result = new int[ sides ];
        TextWindow.println( "----- " + nbrOfThrows + " kast av " + player.getName() + 
                " med " + sides + "-sidig t�rning -----" );
        for( int i = 0; i < nbrOfThrows; i++ ) {
            // Låta spelaren kasta sin tärning
            aThrow = player.throwDice();
            // Öka räknare för antalet prickar i kastet.
            result[ aThrow - 1 ]++;
        }
        // Utskrift av antalet 1:r, 2:or osv
        TestSimpleDice.printResult( result );
    }
    
    public static void main(String[] args) {
////        Cheater player1 = new Cheater( "Stefan" , new SimpleDice(8) );
////        Cheater player2 = new Cheater( "Signe" );
////        
//        TestCheater.roll( player1, 1000000 );
//        TestCheater.roll( player2, 1000000 );
//        ( (Cheater)player1 ).setDice( new SimpleDice( 2 ) );
//        TestCheater.roll( player1, 1000000 );
//        ( (Cheater)player2 ).setDice( new SimpleDice( 1 ) );
//        TestCheater.roll( player2, 1000000 );
    	 Player player1 = new OrdinaryPlayer( "Viktor",new SimpleDice( 6 ) );     
    	 Player player2 = new Cheater( "Signe", new SimpleDice( 6 ) );     
    	 Game game = new Game( player1, player2 );     
    	 TextWindow.println( "\nResultatet av tio spel" );     
    	 for( int i=0; i<10; i++ )         
    		 game.play( false ); 
    }
}
