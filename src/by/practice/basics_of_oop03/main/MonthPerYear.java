package by.practice.basics_of_oop03.main;

public enum MonthPerYear {
	January("Январь"), 
	February("Февраль"),
	March("Март"), 
	April("Апрель"), 
	May("Май"), 
	June("Июнь"), 
	July("Июль"), 
	August("Август"), 
	September("Сентябрь"), 
	October("Октябрь"),
	November("Ноябрь"),
	December("Декабрь");
	
	private String title;
	
	MonthPerYear(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
