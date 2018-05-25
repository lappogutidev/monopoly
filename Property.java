public class Property extends Square {

	private int price;
	
	public Property(String name, int price) {
	
		super(name);
		
		this.price = price;
	
	}
	
	public int getPrice() {
	
		return price;
	
	}
	
	public int getMortgageValue() {
	
		return price / 2;
	
	}
		
	@Override
	public String toString() {
	
		return "$" + getPrice() + " " + getName();
	
	}

}