package java8DateTimeDemo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest {

	public static void main(String[] args) {
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int Days= Period.between(initialDate, finalDate).getDays();
		System.out.println(Days);
		
	long between= ChronoUnit.DAYS.between(initialDate, finalDate);
	System.out.println(between);
		
			
	}
	
}
