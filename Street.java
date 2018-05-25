public class Street extends Property {

	private ColorGroup colorGroup;
	
	private int[] rents;
	private int houses;
	private int housePrice;
	
	public Street(String name, int price, ColorGroup colorGroup, int[] rents) {
	
		super(name, price);
		
		this.colorGroup = colorGroup;
		this.rents = rents;
		this.houses = 0;
		
		switch(colorGroup) {
		
			case DarkPurple:
			case LightBlue:
				housePrice = 50;
				break;
			case LightPurple:
			case Orange:
				housePrice = 100;
				break;
			case Red:
			case Yellow:
				housePrice = 150;
				break;
			case Green:
			case DarkBlue:
				housePrice = 200;
				break;
		
		}
	
	}
	
	public int[] getRents() {
	
		return rents;
		
	}
	
	public ColorGroup getColorGroup() {
	
		return colorGroup;
	
	}
	
	public int getHouses() {
	
		return houses;
	
	}
	
	public int getHousePrice() {
	
		return housePrice;
	
	}
	
	public int getRent() {
	
		return rents[houses];
	
	}
	
	@Override
	public String toString() {
	
		String result = "\n";
		
		result += getName() + "\n" + getPrice() + "\n";
		
		for (int i = 0; i < rents.length; i++) {
		
			result += "Rent With " + i + " Houses " + rents[i] + "\n";
		
		}
		
		result += "Mortgage Value\t" + getMortgageValue() + "\nHouse Price\t" + getHousePrice() + "\n";
	
		return result;
	
	}

}