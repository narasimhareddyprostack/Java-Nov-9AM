package datetimeex;

import java.time.LocalDate;
import java.time.Period;

public class Age {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1983, 7, 11);
		LocalDate dt=LocalDate.now();
		//print age 
		Period age=Period.between(dob, dt);
		System.out.println(age.getYears()+" Years " + age.getMonths() + " Months "+ age.getDays() + " Days");
	}

}
