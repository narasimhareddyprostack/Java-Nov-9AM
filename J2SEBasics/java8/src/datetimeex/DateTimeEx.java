package datetimeex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeEx {

	public static void main(String[] args) {
	
	LocalDate	dt=LocalDate.now();
	LocalTime ct=LocalTime.now();
	LocalDateTime dat=LocalDateTime.now();
	
	System.out.println(dt);
	System.out.println(ct);
	System.out.println(dat);
	
	
	LocalDate dob=LocalDate.of(1983,7, 11);
	System.out.println(dob);
	}

}
