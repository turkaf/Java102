import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManager {
	private static ArrayList<Product> notebookList = new ArrayList<>();
	private static ArrayList<Product> mobilePhoneList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public void addProduct(Product product) {
		System.out.println("Eklemek istediğiniz ürüne ait bilgileri giriniz!");
		
		if(product instanceof Notebook) {
			System.out.print("ID: ");
			int id = scan.nextInt();
			
			System.out.print("Ürün adı: ");
			String name = scan.next();
			String newName = name.substring(0, 1).toUpperCase() + name.substring(1);
			
			System.out.print("Fiyat: ");
			double price = scan.nextDouble();
			
			System.out.println("Aşağıdaki markalardan birini seçiniz:");
			BrandManager.brandLists();
			BrandManager.brandArrayLists();
			Brand selectedBrand = null;
			
			int brandInfo = scan.nextInt();
			for(int i = 0; i < BrandManager.getBrandArrayList().size(); i++) {
				if((brandInfo - 1) == i) {
					selectedBrand = BrandManager.getBrandArrayList().get(i);
				}
			}
			
			System.out.print("Depolama: ");
			int memory = scan.nextInt();
			
			System.out.print("Ekran: ");
			double screenSize = scan.nextDouble();
			
			System.out.print("RAM: ");
			int ram = scan.nextInt();
			
			product = new Notebook(id, newName, price, selectedBrand, memory, screenSize, ram);
			if(!notebookList.contains(product)) {
				notebookList.add(product);
			}else {
				System.out.println("\nVarolan ID numarasına sahip başka bir ürün ekleyemezsiniz!\n");
			}
			Collections.sort(notebookList);
		}else if(product instanceof MobilePhone) {
			System.out.print("ID: ");
			int id = scan.nextInt();
			
			System.out.print("Ürün adı: ");
			String name = scan.next();
			String newName = name.substring(0, 1).toUpperCase() + name.substring(1);
			
			System.out.print("Fiyat: ");
			double price = scan.nextDouble();
			
			System.out.println("Aşağıdaki markalardan birini seçiniz:");
			BrandManager.brandLists();
			BrandManager.brandArrayLists();;
			Brand selectedBrand = null;
			
			int brandInfo = scan.nextInt();
			for(int i = 0; i < BrandManager.getBrandArrayList().size(); i++) {
				if((brandInfo - 1) == i) {
					selectedBrand = BrandManager.getBrandArrayList().get(i);
				}
			}
			
			System.out.print("Depolama: ");
			int memory = scan.nextInt();
			
			System.out.print("Ekran: ");
			double screenSize = scan.nextDouble();
			
			System.out.print("RAM: ");
			int ram = scan.nextInt();
			
			System.out.print("Kamera: ");
			int camera = scan.nextInt();
			
			System.out.print("Pil: ");
			double chargeCapacity = scan.nextDouble();
			
			System.out.print("Renk: ");
			String color = scan.next();
			String newColor = color.substring(0, 1).toUpperCase() + color.substring(1);
			
			product = new MobilePhone(id, newName, price, selectedBrand, memory, screenSize, ram, camera, chargeCapacity, newColor);
			if(!mobilePhoneList.contains(product)) {
				mobilePhoneList.add((MobilePhone) product);
			}else {
				System.out.println("\nVarolan ID numarasına sahip başka bir ürün ekleyemezsiniz!\n");
			}
			Collections.sort(mobilePhoneList);
		}
	}
	
	public void deleteNotebook(int id) {
		for(int i = 0; i < notebookList.size(); i++) {
			if(id == notebookList.get(i).getId()) {
				notebookList.remove(i);
				break;
			}
		}
	}
	
	public void deleteMobilePhone(int id) {
		for(int i = 0; i < mobilePhoneList.size(); i++) {
			if(id == mobilePhoneList.get(i).getId()) {
				mobilePhoneList.remove(i);
				break;
			}
		}
	}
	
	
	public void viewNotebookList() {
		Iterator<Product> itr = notebookList.iterator();
		while(itr.hasNext()) {
			Product temp = itr.next();
			System.out.printf("| %-2s | %-20s | %-10s | %-10s | %-10s | %-8s | %-8s |", temp.getId(), temp.getBrand() + " " + temp.getName(), 
					temp.getPrice() + " TL", temp.getBrand(), temp.getMemory() + " GB", temp.getScreenSize() + " INC", temp.getRam() + " GB");
			System.out.println();
		}
	}
	
	public void viewMobilePhoneList() {
		Iterator<Product> itr = mobilePhoneList.iterator();
		while(itr.hasNext()) {
			Product temp = itr.next();
			System.out.printf("| %-2s | %-20s | %-10s | %-10s | %-10s | %-8s | %-8s | %-8s | %-15s | %-8s |", temp.getId(), temp.getBrand() + " " + temp.getName(), 
					temp.getPrice() + " TL", temp.getBrand(), temp.getMemory() + " GB", temp.getScreenSize() + " INC", temp.getRam() + " GB", 
					((MobilePhone) temp).getCamera() + " MP", ((MobilePhone) temp).getChargeCapacity() + " mAH", ((MobilePhone) temp).getColor());
			System.out.println();
		}
	}

	public ArrayList<Product> getNotebookList() {
		return notebookList;
	}

	public ArrayList<Product> getMobilePhoneList() {
		return mobilePhoneList;
	}
}