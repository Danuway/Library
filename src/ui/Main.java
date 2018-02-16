package ui;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import models.Book;
import models.BookCatalog;
import models.Customer;
import utilities.GenderType;

public class Main {
 
	public static void main(String[] args) {

		double d = 1;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(5);
		nf.setMaximumFractionDigits(5);
		for (int i = 0; i < 10; i++) {
			d += 0.1;
			//System.out.println(nf.format(d));
			System.out.println(d);
		}
		
		BigDecimal price = new BigDecimal("0.1");
		BigDecimal addValue = new BigDecimal("0.1");
		for (int i = 0; i < 10; i++) {
			price = price.add(addValue);
			//System.out.println(nf.format(d));
			System.out.println(price);
		}
		
		
		/*
		Locale ethio = new Locale("am","et");
		Locale swiss = new Locale("fr","ch");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(ethio);
		System.out.println(nf1.format(d));
		NumberFormat nf = NumberFormat.getCurrencyInstance(swiss);
		System.out.println(nf.format(d));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		System.out.println(nf2.format(d));
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf3.format(d));
	
		*/
		
		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1, "An introduction to Java", "Matt Greencfoft", "12345", "Anytown Branch", 400);
		Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "12345", "Anytown Branch",150);

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
		System.out.println(customer.getMailingName());
	}

}