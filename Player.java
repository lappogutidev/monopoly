import java.util.ArrayList;

public class Player {

	private String name;
	
	private int balance;
	private int id;
	private int position = 0;
	
	private ArrayList<Property> properties = new ArrayList<Property>();
	
	public Player(String name, int id) {
	
		this.name = name;
		this.balance = 1500;
		
		this.id = id;
	
	}
	

}