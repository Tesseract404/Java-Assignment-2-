package com.arnob.prody;

public class products {
  private int id;
  private String name;
  private double price;
  private double qty;
    
	public products(int id, String name, double price, double qty) {
		this.id= id;
		this.name=name;
		this.price= price; 
		this.qty= qty; 

	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "products [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	

	 
}
