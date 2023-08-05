import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class BrandManager {
	private static TreeSet<Brand> brandList = new TreeSet<>();
	private static ArrayList<Brand> brandArrayList = new ArrayList<>();
	
	public static void brandLists() {
		brandList.add(new Brand(1, "Samsung"));
		brandList.add(new Brand(2, "Lenovo"));
		brandList.add(new Brand(3, "Apple"));
		brandList.add(new Brand(4, "Huawei"));
		brandList.add(new Brand(5, "Casper"));
		brandList.add(new Brand(6, "Asus"));
		brandList.add(new Brand(7, "HP"));
		brandList.add(new Brand(8, "Xiaomi"));
		brandList.add(new Brand(9, "Monster"));
		
		Iterator<Brand> itr = brandList.iterator();
		int i = 0;
		while(itr.hasNext()) {
			System.out.println(++i + " - " + itr.next());
		}
	}
	
	public static void brandArrayLists() {
		brandArrayList.addAll(brandList);
	}

	public static ArrayList<Brand> getBrandArrayList() {
		return brandArrayList;
	}

	public static TreeSet<Brand> getBrandList() {
		return brandList;
	}
}