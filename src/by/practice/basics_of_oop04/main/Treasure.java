package by.practice.basics_of_oop04.main;

public class Treasure {
	private String nameOfTreasure;
	private int price;

	public Treasure() {

	}

	public Treasure(String nameOfTreasure, int price) {
		this.nameOfTreasure = nameOfTreasure;
		this.price = price;
	}

	public String getNameOfTreasure() {
		return nameOfTreasure;
	}

	public void setNameOfTreasure(String nameOfTreasure) {
		this.nameOfTreasure = nameOfTreasure;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return nameOfTreasure + ": " + price + " золотых\n";
	}

}
