import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", 244, "Author 1", LocalDate.of(2001, 1, 1)));
        books.add(new Book("Book 2", 50, "Author 2", LocalDate.of(2002, 3, 4)));
        books.add(new Book("Book 3", 144, "Author 3", LocalDate.of(2003, 10, 5)));
        books.add(new Book("Book 4", 75, "Author 4", LocalDate.of(2004, 2, 5)));
        books.add(new Book("Book 5", 544, "Author 5", LocalDate.of(2011, 11, 6)));
        books.add(new Book("Book 6", 220, "Author 6", LocalDate.of(2021, 1, 15)));
        books.add(new Book("Book 7", 111, "Author 7", LocalDate.of(2013, 5, 12)));
        books.add(new Book("Book 8", 57, "Author 8", LocalDate.of(2017, 4, 25)));
        books.add(new Book("Book 9", 428, "Author 9", LocalDate.of(2009, 12, 5)));
        books.add(new Book("Book 10", 300, "Author 10", LocalDate.of(2010, 10, 30)));

//        Map<String,String> map = books.stream().collect(Collectors.toMap(Book::getName,Book::getAuthorName));
//        map.forEach((name, authorName) -> System.out.println("Book Name: " + name + ", Author: " + authorName));
        Map<String, String> map = new TreeMap<>();
        books.forEach(book -> map.put(book.getName(), book.getAuthorName()));
        map.forEach((name, author) -> System.out.println("Book Name: " + name + ", Author: " + author));

        List<Book> books100 = books.stream().filter(book -> book.getPageCount() > 100).toList();
        System.out.println("\nBooks with more than 100 pages:");
        books100.forEach(book -> System.out.println("Book Name: " + book.getName() + ", Page Count: " + book.getPageCount()));
	}

}
