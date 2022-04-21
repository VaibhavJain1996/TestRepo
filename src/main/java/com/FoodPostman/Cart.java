package com.FoodPostman;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	int id;
	String item;
	int quantity;
	double total;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", item=" + item + ", quantity=" + quantity + ", total=" + total + ", price=" + price
				+ ", name=" + name + "]";
	}

	public Cart(int id, String item, int quantity, double total, double price, String name) {
		super();
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.total = total;
		this.price = price;
		this.name = name;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double price;
	String name;

}
