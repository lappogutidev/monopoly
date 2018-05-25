public class Railroad extends Property {

	public Railroad(String name) {
	
		super(name, 200);
	
	}
	
	public int getRent(int numberOfRailroads) {
	
		return 50 * numberOfRailroads;
	
	}
	
	public String toString() {
	
		String result = "\n" + getName() + "\n";
		
		result += getPrice() + "\n";
		
		for (int i = 0; i < 4; i++) {
		
			result += "Rent With " + i + " Railroads " + getRent(i) + "\n";
		
		}
		
		result += "Mortgage Value " + getMortgageValue() + "\n";
		
		return result;
	
	}

}