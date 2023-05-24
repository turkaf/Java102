
public class SafeHouse extends Location {

	// Constructor
	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
		
	}

	@Override
	public boolean onLocation() {
		System.out.println("Güvenli evdesiniz!");
		System.out.println("Canınız yenilendi!");
		System.out.println("-------------------------------------------------------------------------------------------------");
		this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		return true;
	}

}
