package by.practice.basics_of_oop04.main;

public class Calculation {
	private ReadData rd;

	public Calculation(ReadData rd) {
		this.rd = rd;
	}

	/*
	 * Максимальная стоимость из всех сокровищ
	 */
	public int getTheMostExpensive() {

		int maxPrice = 0;

		for (Treasure t : rd.getTreasure())
			if (t.getPrice() > maxPrice)
				maxPrice = t.getPrice();

		return maxPrice;
	}

	/*
	 * Минимальная стоимость из всех сокровищ
	 */
	public int getTheLessExpensive() {
		int minPrice = getTheMostExpensive();

		for (Treasure t : rd.getTreasure())
			if (t.getPrice() < minPrice)
				minPrice = t.getPrice();

		return minPrice;
	}
}
