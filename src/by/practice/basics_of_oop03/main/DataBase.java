package by.practice.basics_of_oop03.main;

public class DataBase {
	public DataBase() {
		CCalendar.FreeDay c = new CCalendar.FreeDay();

		c.getWeekend().add(new CCalendar(2024, MonthPerYear.January, DayPerMonth.GetHoliday(MonthPerYear.January),
				DayPerMonth.GetWeekend(MonthPerYear.January)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.February, DayPerMonth.GetHoliday(MonthPerYear.February),
				DayPerMonth.GetWeekend(MonthPerYear.February)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.March, DayPerMonth.GetHoliday(MonthPerYear.March),
				DayPerMonth.GetWeekend(MonthPerYear.March)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.April, DayPerMonth.GetHoliday(MonthPerYear.April),
				DayPerMonth.GetWeekend(MonthPerYear.April)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.May, DayPerMonth.GetHoliday(MonthPerYear.May),
				DayPerMonth.GetWeekend(MonthPerYear.May)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.June, DayPerMonth.GetHoliday(MonthPerYear.June),
				DayPerMonth.GetWeekend(MonthPerYear.June)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.July, DayPerMonth.GetHoliday(MonthPerYear.July),
				DayPerMonth.GetWeekend(MonthPerYear.July)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.August, DayPerMonth.GetHoliday(MonthPerYear.August),
				DayPerMonth.GetWeekend(MonthPerYear.August)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.September, DayPerMonth.GetHoliday(MonthPerYear.September),
				DayPerMonth.GetWeekend(MonthPerYear.September)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.October, DayPerMonth.GetHoliday(MonthPerYear.October),
				DayPerMonth.GetWeekend(MonthPerYear.October)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.November, DayPerMonth.GetHoliday(MonthPerYear.November),
				DayPerMonth.GetWeekend(MonthPerYear.November)));
		c.getWeekend().add(new CCalendar(2024, MonthPerYear.December, DayPerMonth.GetHoliday(MonthPerYear.December),
				DayPerMonth.GetWeekend(MonthPerYear.December)));

		System.out.println(c);
	}
}
