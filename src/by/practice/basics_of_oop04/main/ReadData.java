package by.practice.basics_of_oop04.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadData {
	private final String MYPATH = "dataFiles/ListOfTreasures.txt";
	private List<Treasure> treasure;
	private Choice choice;
	private Calculation calculation;

	private int numberChoice;

	public ReadData() {
		treasure = new ArrayList<Treasure>();
		choice = new Choice(this);
		calculation = new Calculation(this);
	}

	/*
	 * Читаем из файла список и создаем массив из сокровищ с ценой
	 */
	public void readSave() throws IOException {
		File file = new File(getPATH());
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str = "";
		while ((str = br.readLine()) != null) {
			String[] strPrice = str.split("-");
			treasure.add(new Treasure(strPrice[0], Integer.parseInt(strPrice[1].replaceAll("\\s", ""))));
		}

	}

	/*
	 * Вводим сумму для выбора сокровища
	 */
	public void dataEntry() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("Введите сумму в диапазоне [" + calculation.getTheLessExpensive() + " - "
					+ calculation.getTheMostExpensive() + "]");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введите число");
			}

			this.setNumberChoice(sc.nextInt());

			if (this.getNumberChoice() < calculation.getTheLessExpensive()
					|| this.getNumberChoice() > calculation.getTheMostExpensive()) {
				System.out.println("Введены данные за пределами диапазона, попробуйте еще раз");
				sc.nextLine();
			} else
				break;

		}

	}

	public String getPATH() {
		return MYPATH;
	}

	public List<Treasure> getTreasure() {
		return treasure;
	}

	public void setTreasure(List<Treasure> treasure) {
		this.treasure = treasure;
	}

	public Calculation getCalculation() {
		return calculation;
	}

	public int getNumberChoice() {
		return numberChoice;
	}

	public void setNumberChoice(int numberChoice) {
		this.numberChoice = numberChoice;
	}

	@Override
	public String toString() {
		return treasure + "\n";
	}
}
