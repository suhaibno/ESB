package com.suhaibsoft;

import java.util.List;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String SSN;
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	private List<Order> basket;
	private double totalPrice;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Order> getBasket() {
		return basket;
	}
	public void setBasket(List<Order> basket) {
		this.basket = basket;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
	
	

}
