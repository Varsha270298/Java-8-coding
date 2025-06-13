package java8DateTimeDemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo2 {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.parse("2024-06-25").getDayOfWeek();
		System.out.println(dayOfWeek);
		int dayOfMonth = LocalDate.parse("2024-06-25").getDayOfMonth();
		System.out.println(dayOfWeek);
		System.out.println();
		
		
		LocalDate thisYear = LocalDate.now();
		System.out.println(thisYear.isLeapYear());
		
		
		LocalDate previousYear = LocalDate.now().minusYears(1);
		System.out.println(previousYear.isLeapYear());
		
		boolean before = LocalDate.parse("2024-06-25").isBefore(LocalDate.parse("2023-06-25"));
		System.out.println(before);
		
		boolean after = LocalDate.parse("2024-06-25").isAfter(LocalDate.parse("2025-06-25"));
		System.out.println(after);
		
		
		LocalDateTime atStartOfDay = LocalDate.parse("2017-03-01").atStartOfDay();
		System.out.println(atStartOfDay);
		
		LocalDate with = LocalDate.parse("2017-03-01").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(with);
		
		
		}

}
