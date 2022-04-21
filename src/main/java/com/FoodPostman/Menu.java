package com.FoodPostman;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="menu")
public class Menu {
        @Id
        int id;
        String item;
		public Menu() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Menu(int id, String item, String category, double price) {
			super();
			this.id = id;
			this.item = item;
			this.category = category;
			this.price = price;
		}
		String category;
        double price;
		@Override
		public String toString() {
			return "Product "+" p_id=" + id + ", item=" + item + ", price=" + price;
		}
		public int getId() {
			return id;
		}
		public void setP_id(int id) {
			this.id = id;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
			
		
}
