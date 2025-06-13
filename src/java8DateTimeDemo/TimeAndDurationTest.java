package java8DateTimeDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeAndDurationTest {

	public static void main(String[] args) {
		LocalTime initialTime = LocalTime.of(6,30,0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		long thirty= Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(thirty);
		
	long between= ChronoUnit.SECONDS.between(finalTime,initialTime);

}
}