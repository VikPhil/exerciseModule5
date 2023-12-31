/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку 
 * из нескольких товаров.
 * */
package by.practice.basics_of_oop02.main;

public class Main {

	public static void main(String[] args) {
	
		Payment payment = new Payment();
		
		payment.getPayments().add(new Payment.Product("Мороженое", 3, 35.8));
		payment.getPayments().add(new Payment.Product("Хрен", 20, 5.7));
		payment.getPayments().add(new Payment.Product("Сироп",8, 10.0));
		payment.getPayments().add(new Payment.Product("Хлеб",2, 1.03));
		payment.getPayments().add(new Payment.Product("Чай",1, 0.20));
		
		System.out.println(payment);
	}

}
