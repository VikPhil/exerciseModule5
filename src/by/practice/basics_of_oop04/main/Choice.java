package by.practice.basics_of_oop04.main;

public class Choice {
	private ReadData rsd;

	public Choice() {

	}

	public Choice(ReadData rsd) {
		this.rsd = rsd;
	}

	/*
	 * Показываем все сокровища
	 */
	public void showList() {
		for (Treasure t : rsd.getTreasure())
			System.out.print(t);
	}

	/*
	 * Показываем самые дорогие сокровища
	 */
	public void showExpensiveTreasures() {

		System.out.println("<<Самые дорогие сокровища из списка>>");

		for (Treasure t : rsd.getTreasure()) {
			if (rsd.getCalculation().getTheMostExpensive() == t.getPrice())
				System.out.print(t);
		}
	}

	/*
	 * Показываем выбранные сокровища
	 */
	public void showTheTreasureByPrice() {
		System.out.println("<<Выбранные вами сокровища>>");
		boolean temp = false;
		for (Treasure t : rsd.getTreasure()) {
			if (rsd.getNumberChoice() == t.getPrice()) {
				System.out.print(t);
				temp = true;
			}
		}
		if (!temp)
			System.out.println("Извините, с такой ценой сокровищ в списке нет.");
	}
}
