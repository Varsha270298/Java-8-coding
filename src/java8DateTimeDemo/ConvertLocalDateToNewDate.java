package java8DateTimeDemo;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertLocalDateToNewDate {

	public static void main(String[] args) {
	Date date = new Date();
	 
	LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	System.out.println(localDateTime);

	
	Calendar calendar = Calendar.getInstance();
	LocalDateTime localDateTime1 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
	System.out.println(localDateTime1);
	}

}
