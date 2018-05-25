public class Utility extends Property {

	public Utility(String name) {
	
		super(name, 150);
	
	}
	
	public int getRent(int numberOfUtilities, int roll) {
	
		if (numberOfUtilities == 1)
			return 4 * roll;
		else if (numberOfUtilities == 2)
			return 10 * roll;
		else
			return 0;
	
	}

}