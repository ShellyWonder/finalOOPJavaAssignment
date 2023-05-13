package com.wonderwebdev;

public class Product {
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
private int id;
private String name;
private int quantity;
private double price;

//You should also create a default constructor


//and a parameterized constructor for the Product class.

public Product(int id, String name, int quantity, double price) {
	
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}

}
