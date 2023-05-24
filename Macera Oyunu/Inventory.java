
public class Inventory {
	private Weapon weapon;
	private Armor armor;
	
	// Constructor
	public Inventory() {
		this.weapon = new Weapon("Yumruk", -1, 0, 0);
		this.armor = new Armor(-1, "Paçavra", 0, 0);
	}

	
	// getter and setter methods
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	
}
