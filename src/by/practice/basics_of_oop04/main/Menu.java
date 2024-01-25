package by.practice.basics_of_oop04.main;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	private ReadData rsd;
	private Choice choice;

	public Menu() throws IOException {
		initClases();
		showMenu();
	}

	private void initClases() throws IOException {
		rsd = new ReadData();
		choice = new Choice(rsd);
		rsd.readSave();
	}

	private void showMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("СОКРОВИЩА ДРАКОНА!\n");
		System.out.println("**Показать все сокровища(1)");
		System.out.println("**Показать самые дорогие из списка(2)");
		System.out.println("**Выбор сокрвища на сумму(3)");
		System.out.println("**Для выхода из системы нажмите(4)\n");

		do {
			System.out.print("Введите ваш выбор из меню: ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введите число");
			}

			number = sc.nextInt();

			switch (number) {
			case 1:
				choice.showList();
				break;
			case 2:
				choice.showExpensiveTreasures();
				break;
			case 3:
				rsd.dataEntry();
				choice.showTheTreasureByPrice();
				break;
			default:
				System.out.println("EXIT");
				break;
			}
		} while (number != 4);
	}
}
