package java8DateTimeDemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	

	public static void main(String[] args) {
		
      LocalDate localDate1 = LocalDate.now();//Thread safe
      System.out.println(localDate1);
      
      
      
       Clock clock = Clock.systemDefaultZone();
      LocalDate localDate2 = LocalDate.now(clock);
      System.out.println(localDate2);
      	
      ZoneId zoneId = ZoneId.of("Europe/Paris");
      LocalDate localDate3 = LocalDate.now(zoneId);
      System.out.println(localDate3);
      
      
      System.out.println("----------------------------------");
      LocalDate localDate4 =LocalDate.of(2024, 06, 29);
      System.out.println(localDate4);
      
      LocalDate localDate5 =LocalDate.parse("2024-06-25");
      System.out.println(localDate5);
      

      LocalDate localDate6 =localDate5.plusDays(2);
      System.out.println(localDate6);
      
      
      LocalDate minus = localDate5.minus(2, ChronoUnit.DAYS);
      System.out.println(minus);
	}

}
