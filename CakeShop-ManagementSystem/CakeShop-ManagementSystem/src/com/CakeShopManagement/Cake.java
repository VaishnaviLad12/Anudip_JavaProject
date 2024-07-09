package com.CakeShopManagement;

public class Cake {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Cake(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

    // Getters and setters
}

