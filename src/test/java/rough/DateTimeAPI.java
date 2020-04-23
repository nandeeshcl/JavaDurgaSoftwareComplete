package rough;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPI {

	public static void main(String[] args) {


		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		
		
		System.out.println("Date: "+d);
		System.out.println("Time: "+t);
		System.out.println("DateTime: "+dt);

	}

}
