import java.util.Scanner;

public class Player {
	private int damage;
	private int health;
	private int originalHealth;
	private int money;
	private String charName;
	private String name;
	private Scanner input = new Scanner(System.in);
	private Inventory inventory;
	
	// Constructor
	public Player(String name) {
		this.name = name;
		this.setInventory(new Inventory());
	}
	
	
	// method for selecting character
	public void selectChar() {
		Samurai samurai = new Samurai();
		Archer archer = new Archer();
		Knight knight = new Knight();
		
		GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
		
		System.out.println("Karakterler");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		for(GameChar gameChar: charList) {
			System.out.println("ID: " + gameChar.getId() +
					"\t Karakter: " + gameChar.getName() +
					"\t\t Hasar: " + gameChar.getDamage() +
					"\t\t Sağlık: " + gameChar.getHealth() +
					"\t\t Para: " + gameChar.getMoney());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		// selecting character
		System.out.print("Lütfen bir karakter giriniz: ");
		int selectChar = input.nextInt();
		
		switch(selectChar) {
			case 1: 
				initPlayer(new Samurai());
				break;
			case 2:
				initPlayer(new Archer());
				break;
			case 3:
				initPlayer(new Knight());
				break;
			default:
				initPlayer(new Samurai());
		}
		
		// printing the selected character
		/*System.out.println("Karakter: " + this.getCharName() +
				", Hasar: " + this.getDamage() + 
				", Sağlık: " + this.getHealth() +
				", Para: " + this.getMoney());
		*/
	}
	
	
	// method for initializing the player
	public void initPlayer(GameChar gameChar) {
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setOriginalHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setCharName(gameChar.getName());
	}

	public void printInfo() {
		System.out.println(
				"Silah: " + this.getInventory().getWeapon().getName() +
				", Zırh: " + this.getInventory().getArmor().getName() +
				", Bloklama: " + this.getInventory().getArmor().getBlock() +
				", Hasar: " + this.getTotalDamage() + 
				", Sağlık: " + this.getHealth() +
				", Para: " + this.getMoney());
	}
	
	
	public int getTotalDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}
	
	
	// getter and setter methods
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0) {
			health = 0;
		}
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}


	public Weapon getWeapon() {
		return this.getInventory().getWeapon();
	}
	

}
