import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);
	
	public void start() {
		System.out.println("Macera oyununa hoş geldiniz!");
		System.out.println("Lütfen bir isim giriniz: ");
		//String playerName = input.nextLine();
		Player player = new Player("Ahmet Faruk");
		System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoş geldiniz!");
		System.out.println("Lütfen bir karakter seçiniz!");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		player.selectChar();
		
		Location location = null;
		
		while(true) {
			player.printInfo();
			System.out.println();
			System.out.println("####### Bölgeler #######");
			System.out.println();
			System.out.println("1 - Güvenli Ev");
			System.out.println("2 - Eşya Dükkanı");
			System.out.println("3 - Mağara");
			System.out.println("4 - Orman");
			System.out.println("5 - Nehir");
			System.out.println("0 - Çıkış Yap");
			System.out.println();
			
			System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
			int selectLoc = input.nextInt();
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			switch(selectLoc) {
			case 0:
				location = null;
				break;
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break;
			case 3:
				location = new Cave(player);
				break;
			case 4:
				location = new Forest(player);
				break;
			case 5:
				location = new River(player);
				break;
			default:
				System.out.println("Lütfen geçerli bir bölge giriniz!");
			}
			
			if(location == null) {
				System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtiniz!");
				break;
			}
			
			if(!location.onLocation()) {
				System.out.println("GAME OVER!");
				break;
			}
		}
		
	}
}
