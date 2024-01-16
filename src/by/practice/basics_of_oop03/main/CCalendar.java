package by.practice.basics_of_oop03.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CCalendar {

	private int year;
	private MonthPerYear monthPerYear;
	private int[] holidays;
	private int[] weekends;

	public CCalendar() {

	}

	public CCalendar(int year, MonthPerYear monthPerYear, int[] holidays, int[] weekends) {
		this.year = year;
		this.monthPerYear = monthPerYear;
		this.holidays = holidays;
		this.weekends = weekends;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MonthPerYear getMonthPerYear() {
		return monthPerYear;
	}

	public void setMonthPerYear(MonthPerYear monthPerYear) {
		this.monthPerYear = monthPerYear;
	}
	
	@Override
	public String toString() {
		return "\nГод: " + year + 
				"\nМесяц: " + monthPerYear.getTitle() + 
				"\nПраздничный: " + Arrays.toString(holidays) +
				"\nВыходной: " + Arrays.toString(weekends) + '\n';
	}

	// -------------------------------------------------------------------------------------
	public static class FreeDay {
		private List<CCalendar> weekend;

		public FreeDay() {
			weekend = new ArrayList<CCalendar>();
		}

		public List<CCalendar> getWeekend() {
			return weekend;
		}

		public void setWeekend(List<CCalendar> weekend) {
			this.weekend = weekend;
		}

		@Override
		public String toString() {
			return "ВЫХОДНЫЕ ДНИ" + weekend + '\n';
		}

	}
}
