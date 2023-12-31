package by.practice.basics_of_oop02.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Product> payments;

	public Payment() {
		payments = new ArrayList<Product>();
	}

	public static class Product {
		private String name;
		private int count;
		private double price;

		public Product() {

		}

		public Product(String name, int count, double price) {
			this.setName(name);
			this.setCount(count);
			this.setPrice(price);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Название: " + name + '\n' + 
				   "Количество: " + count + '\n' + 
				   "Цена: " + price + '$' + '\n';
		}
	}

	public List<Product> getPayments() {
		return payments;
	}

	public void setPayments(List<Product> payments) {
		this.payments = payments;
	};

	@Override
	public String toString() {
		return "Продукты: \n" + getPayments();
	}
}
