package models;
import java.util.Date;
import java.util.GregorianCalendar;

import utilities.GenderType;

public class Customer {

	private String title ;
	private String firstName;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private GenderType  gender;
	private boolean isValid = true;
	private Date expiryDate;
	
	
	public Customer(String title, String firstName, String surname, String address, 
			String phoneNumber, String email, int customerNumber, GenderType gender) {
		setName( title, firstName, surname);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isValid = true;
		
		GregorianCalendar gcl = new GregorianCalendar();
		gcl.add(GregorianCalendar.YEAR, 1);
		this.expiryDate = gcl.getTime();
	}
	

	

	public Date getExpiryDate() {
		return expiryDate;
	}




	public String getFirstName() {
	
		return firstName;
	} 
	
	public String getSurname() {
		return surname;
	}
	
	private void setName(String title, String firstName, String surname) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public String getMailingName() {
				
		StringBuilder sb = new StringBuilder(title);
		sb.append(" ");
		sb.append(firstName.substring(0,1));
		sb.append(" ");
		sb.append(surname);
		
		return sb.toString();
		
	}

	public GenderType getGender() {
		
		return gender;
	}
}
 