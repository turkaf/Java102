import java.util.Scanner;

public abstract class Location {
	private Player player;
	private String name;
	public static Scanner input = new Scanner(System.in);
	
	// Constructor
	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}

	public abstract boolean onLocation();
	
	
	// getter and setter methods
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// end of getter and setter methods
	
	
	
}
