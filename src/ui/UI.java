package ui;
import models.Book;

public class UI {

	public void printHeader() {
		System.out.println("BookID  Title                 Author" );
		System.out.println("======  ====================  ====================");
	}

	public void printBook(Book book) {

		System.out.println(fixedLengthString(book.getBookID(), 6) + "  " + fixedLengthString(book.getTitle(), 20) 
		+"  " + "  " + fixedLengthString(book.getAuthor(), 20) );
	}

	
	private String fixedLengthString(String start, int length) {
		//TODO: Fix string padding problem
		if (start.length() >= length) {
			return start.substring(0, length);
		}else {
			while (start.length() < length) {
				start += " ";

			}
			return start;
		}

	}

	
	
	private String fixedLengthString(int start, int length) {

		String startString = String.valueOf(start);
		return fixedLengthString(startString, length);

	}

	
	
	public void printBookCatalog(Book[] bookCatalog) {
		for (int counter = 0; counter < bookCatalog.length; counter++) {
			if (bookCatalog[counter] != null) {
				printBook(bookCatalog[counter]);	
			}
		}

	}
}
