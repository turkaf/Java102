import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Books> books = new TreeSet<>();
		
		Books b1 = new Books("Nexus", 534, "Ramez NAAM","2012");
        Books b2 = new Books("Crux", 568, "Ramez NAAM","2013");
        Books b3 = new Books("Apex", 656, "Ramez NAAM","2015");
        Books b4 = new Books("Atomic Habits", 320, "James CLEAR","2019");
        Books b5 = new Books("Kürk Mantolu Madonna", 177, "Sabahattin ALİ","1943");
        
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        
        for(Books sortedByName: books) {
        	System.out.println(sortedByName.getBookTitle());
        }
        
        
        System.out.println("\n####################\n");

        
        TreeSet<Books> books2 = new TreeSet<>(new Comparator<Books>() {

			@Override
			public int compare(Books o1, Books o2) {
				
				return o1.getPageNumber() - o2.getPageNumber();
			}
        }.reversed());
        
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);
        
        for(Books sortedByPageNumber: books2) {
        	System.out.println(sortedByPageNumber.getBookTitle());
        }
	}
}