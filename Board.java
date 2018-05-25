public class Board {

	Square[] gameboard;
	
	int[][] streetRents = {
	
		{ 2,  10,  30,   90,  160,  250},	// Mediterranean Avenue
		{ 4,  20,  60,  180,  320,  450},	// Baltic Avenue
		
		{ 6,  30,  90,  270,  400,  550},	// Oriental Avenue
		{ 6,  30,  90,  270,  400,  550},	// Vermont Avenue
		{ 8,  40, 100,  300,  450,  600},	// Connecticut Avenue
		
		{10,  50, 150,  450,  625,  750},	// St. Charles Place
		{10,  50, 150,  450,  625,  750},	// States Avenue
		{12,  60, 180,  500,  700,  900},	// Virginia Avenue
		
		{14,  70, 200,  550,  750,  950},	// St. James Place
		{14,  70, 200,  550,  750,  950},	// Tennessee Avenue
		{16,  80, 220,  600,  800, 1000},	// New York Avenue
		
		{18,  90, 250,  700,  875, 1050},	// Kentucky Avenue
		{18,  90, 250,  700,  875, 1150},	// Indian Avenue
		{20, 100, 300,  750,  925, 1100},	// Illinois Avenue
		
		{22, 110, 330,  800,  975, 1150},	// Atlantic Avenue
		{22, 110, 330,  800,  975, 1150},	// Ventor Avenue
		{24, 140, 360,  850, 1025, 1200},	// Marvin Gardens
		
		{26, 130, 390,  900, 1100, 1275},	// Pacific Avenue
		{26, 130, 390,  900, 1100, 1275},	// North Carolina Avenue
		{28, 150, 450, 1000, 1200, 1400},	// Pennsylvania Avenue
		
		{35, 175, 500, 1100, 1300, 1500},	// Park Place
		{50, 200, 600, 1400, 1700, 2000}	// Boardwalk
		
	};
	
	Card[] chanceCards = {
	
		new Card("Win a beauty Contest"),
		new Card("Advance to Go")
		
	};
	
	Card[] communityChestCards = {
	
		new Card("Win a beauty Contest"),
		new Card("Advance to Go")
		
	};
	
	Deck chanceDeck = new Deck(chanceCards, "Chance");
	Deck communityChestDeck = new Deck(communityChestCards, "Community Chest");
	
	public Board() {
	
		Square[] board = {
			new Square("Go"),
			new Street("Mediterranean Avenue", 60, ColorGroup.DarkPurple, streetRents[1]),
			new CardSquare(communityChestDeck),
			new Street("Baltic Avenue", 60, ColorGroup.DarkPurple, streetRents[2]),
			new Square("Income Tax"),
			new Railroad("Reading Railroad"),
			new Street("Oriental Avenue", 100, ColorGroup.LightBlue, streetRents[3]),
			new CardSquare(chanceDeck),
			new Street("Vermont Avenue", 100, ColorGroup.LightBlue, streetRents[4]),
			new Street("Connecticut Avenue", 120, ColorGroup.LightBlue, streetRents[5])
		};
		
		gameboard = board;
	
	}
	
	public String toString() {
	
		String result = "\n";
		
		for (int i = 0; i < gameboard.length; i++) {
		
			if (gameboard[i] instanceof Property)
				result += ((Property) gameboard[i]).getPrice();
		
			result += "\t" + gameboard[i].getName() + "\n";
		
		}
		
		return result;
	
	}

}