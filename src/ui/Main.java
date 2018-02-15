package ui;
import models.Book;
import models.BookCatalog;
import models.Customer;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {



		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1, "An introduction to Java", "Matt Greencfoft", "12345");
		Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456");

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);


		UI ui = new UI();
		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookArray());	

		Book foundBook = bookCatalog.findBook("Better Java");
		if (foundBook != null) {
			System.out.println("We found " + foundBook.getTitle());
		}
		Customer customer = new Customer("Mr","Michael","Smith","1 The High Street", "1234", "a@b.com", 1,GenderType.MALE);
		System.out.println(customer.getExpiryDate());
	}

}