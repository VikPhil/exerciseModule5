package by.practice.basics_of_oop03.main;

public class DayPerMonth {

	private final static int MONDAY = 1;
	private final static int TUESDAY = 2;
	private final static int WEDNESDAY = 3;
	private final static int THURSDAY = 4;
	private final static int FRIDAY = 5;
	private final static int SATURDAY = 6;
	private final static int SUNDAY = 7;

	/*
	 * Праздники
	 */
	public static int[] GetHoliday(MonthPerYear month) {
		switch (month) {
		case January:
			return new int[] { 1, 2, 7 };
		case March:
			return new int[] { 8 };
		case May:
			return new int[] { 1, 9, 14 };
		case July:
			return new int[] { 3 };
		case November:
			return new int[] { 7 };
		case December:
			return new int[] { 25 };
		default:
			return null;
		}
	}

	/*
	 * Выходные
	 */
	public static int[] GetWeekend(MonthPerYear month) {
		switch (month) {
		case January:
			return counterWeekend(MONDAY, 31);
		case February:
			return counterWeekend(THURSDAY, 29);
		case March:
			return counterWeekend(FRIDAY, 31);
		case April:
			return counterWeekend(MONDAY, 30);
		case May:
			return counterWeekend(WEDNESDAY, 31);
		case June:
			return counterWeekend(SATURDAY, 30);
		case July:
			return counterWeekend(MONDAY, 31);
		case August:
			return counterWeekend(THURSDAY, 31);
		case September:
			return counterWeekend(SUNDAY, 30);
		case October:
			return counterWeekend(TUESDAY, 31);
		case November:
			return counterWeekend(FRIDAY, 30);
		case December:
			return counterWeekend(SUNDAY, 31);
		default:
			return null;

		}

	}

	/*
	 * Функция определяет какие числа месяца являются выходными и записывает их в
	 * массив.
	 */
	private static int[] counterWeekend(int day, int numberDays) {
		boolean[] weekDays = new boolean[numberDays];
		int[] weekends;
		int counter = day;
		int sizeArray = 0;

		for (int i = 0; i < numberDays; i++) {
			if (counter >= 6 && counter <= 7) {
				weekDays[i] = true;
				sizeArray++;
				if (counter == 7)
					counter = 0;
			} else
				weekDays[i] = false;
			counter++;
		}

		weekends = new int[sizeArray];
		counter = 1;
		int index = 0;

		for (boolean isWeek : weekDays) {

			if (isWeek) {
				weekends[index] = counter;
				index++;
			}
			counter++;
		}

		return weekends;
	}

}
