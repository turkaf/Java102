
public class Books implements Comparable<Books>{
	private String bookTitle;
	private int pageNumber;
	private String authorName;
	private String releaseDate;
	

	
	
	public Books(String bookTitle, int pageNumber, String authorName, String releaseDate) {
		this.bookTitle = bookTitle;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.releaseDate = releaseDate;
	}

	


	@Override
	public int compareTo(Books o) {
		
		return this.getBookTitle().compareTo(o.getBookTitle());
	}
	
	

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	

}
