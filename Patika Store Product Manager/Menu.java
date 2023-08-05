import java.util.Scanner;

public class Menu {
	private static Scanner scan = new Scanner(System.in);
	private static ProductManager productManager = new ProductManager();
	private static boolean isValid = true;
	
	public void notebookOperations() {
		System.out.println("1 - Ürün Ekle\n2 - Ürün Sil\n3 - Ürün Listele\n4 - Menü\n0 - Çıkış Yap");
		int input = scan.nextInt();
		
		while(isValid) {
			switch (input) {
			case 1: {
				// Add product
				productManager.addProduct(new Notebook(input, null, input, null, input, input, input));
				notebookOperations();
				break;
			}
			case 2: {
				// Delete product
				if(!productManager.getNotebookList().isEmpty()) {
					System.out.print("Lütfen silmek istediğiniz ürüne ait ID numarasınız giriniz: ");
					int deleteId = scan.nextInt();
					productManager.deleteNotebook(deleteId);
					System.out.println(deleteId + " id numarasına sahip ürün silinmiştir!\n");
				}else {
					System.out.println("Sistemde kayıtlı ürün bulunamadı!\n");
				}
				notebookOperations();
				break;
			}
			case 3: {
				// List product
				if(!productManager.getNotebookList().isEmpty()) {
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.printf("| %-2s | %-20s | %-10s | %-10s | %-10s | %-8s | %-8s |", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
					System.out.println("\n------------------------------------------------------------------------------------------");
					productManager.viewNotebookList();
					System.out.println("------------------------------------------------------------------------------------------");
					System.out.println();
				}else {
					System.out.println("Sistemde kayıtlı ürün bulunamadı!\n");
				}
				notebookOperations();
				break;
			}
			case 4: {
				// Menu
				start();
				break;
			}
			case 0: {
				// Exit
				isValid = false;
				break;
			}
			default:
				System.out.println("Geçersiz değer girdiniz, lütfen tekrar deneyiniz!\n");
				notebookOperations();
				break;
			}
		}
	}
	
	public void mobilePhoneOperations() {
		System.out.println("1 - Ürün Ekle\n2 - Ürün Sil\n3 - Ürün Listele\n4 - Menü\n0 - Çıkış Yap");
		int input = scan.nextInt();
		
		while(isValid) {	
			switch (input) {
			case 1: {
				// Add product
				productManager.addProduct(new MobilePhone(input, null, input, null, input, input, input, input, input, null));
				mobilePhoneOperations();
				break;
			}
			case 2: {
				// Delete product
				if(!productManager.getMobilePhoneList().isEmpty()) {
					System.out.print("Lütfen silmek istediğiniz ürüne ait ID numarasınız giriniz: ");
					int deleteId = scan.nextInt();
					productManager.deleteMobilePhone(deleteId);
					System.out.println(deleteId + " id numarasına sahip ürün silinmiştir!\n");
				}else {
					System.out.println("Sistemde kayıtlı ürün bulunamadı!\n");
				}
				mobilePhoneOperations();
				break;
			}
			case 3: {
				// List product
				if(!productManager.getMobilePhoneList().isEmpty()) {
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("| %-2s | %-20s | %-10s | %-10s | %-10s | %-8s | %-8s | %-8s | %-15s | %-8s |", "ID", "Ürün Adı", 
							"Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Pil", "Renk");
					System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------");
					productManager.viewMobilePhoneList();
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
				}else {
					System.out.println("Sistemde kayıtlı ürün bulunamadı!\n");
				}
				mobilePhoneOperations();
				break;
			}
			case 4: {
				// Menu
				start();
				break;
			}
			case 0: {
				// Exit
				isValid = false;
				break;
			}
			default:
				System.out.println("Geçersiz değer girdiniz, lütfen tekrar deneyiniz!\n");
				mobilePhoneOperations();
				break;
			}
		}
	}
	
	public void brandViewer() {
		System.out.println("\nMarkalarımız:\n-------------");
		BrandManager.brandLists();
		System.out.println("\nMenü: 4, Çıkış: 0");
		int input = scan.nextInt();
		switch (input) {
		case 4: {
			start();
			break;
		}
		case 0: {
			isValid = false;
			break;
		}
		default:
			System.out.println("Geçersiz değer girdiniz, menüye yönlendiriliyorsunuz!\n");
			start();
			break;
		}
	}
	
	public void start() {
		
		System.out.print("1 - Notebook İşlemleri\n2 - Cep Telefonu İşlemleri\n3 - Marka Listele\n0 - Çıkış Yap\n--------------------------------\nTercihiniz: ");
		
		int input;
		
		while(isValid) {
			input = scan.nextInt();
			System.out.println();
			switch (input) {
			case 1: {
				notebookOperations();
				break;
			}
			case 2: {
				mobilePhoneOperations();
				break;
			}
			case 3: {
				brandViewer();
				break;
			}
			case 0: {
				isValid = false;
				break;
			}
			default:
				System.out.println("Geçersiz değer girdiniz, lütfen tekrar deneyiniz!");
				break;
			}
		}
	}
}