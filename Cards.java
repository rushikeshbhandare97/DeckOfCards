package deckofcards;

public class Cards {
	
	   
	public static void main(String[] args) {
		//Initialization of cards
		int[]  deck= new int[52];
		String [] suits= {"Spades","Hearts","Diamonds","clubs"};
		String [] ranks= {"Ace", "2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
		
		for(int i=0; i<deck.length; i++ ); {
			
			int i = 0;
			deck[i]=i;
			
			
			
			
		}
		
		//Display the  cards
		for(int i=0 ; i<52 ; i++);
		{
			
			int i = 0;
			String suit=suits [deck[i]%13];
			String rank =ranks[deck[i]%13];
			
			System.out.println(rank + " of " +suit);
			
		}
	
		
		
		
		
	}
	
	
	

}
